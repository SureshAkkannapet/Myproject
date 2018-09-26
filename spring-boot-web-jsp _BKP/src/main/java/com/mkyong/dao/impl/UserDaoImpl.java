package com.mkyong.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkyong.bean.User;
import com.mkyong.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	/*@Autowired
	private SessionFactory sessionFactory;
	List<User> userlist=new  ArrayList<User>();
	*/
	
	
	@Autowired
	private JdbcTemplate template;
	List<User> userlist=new ArrayList<User>();
	@Override
	public void adduser(User user) {
		userlist.add(user);
		//Session ses=sessionFactory.openSession();
		//ses.save(user);
		template.update("INSERT INTO SURESH_PRACTICE_USER(USERNAME,PASSWORD,EMAIL,BIRTHDATE,PROFESSION) VALUES(?,?,?,?,?)", user.getUsername(),user.getPassword(),user.getEmail(),user.getBirthDate(),user.getProfession());
	}

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		
		 String sql = "SELECT USERNAME,EMAIL,BIRTHDATE,PROFESSION FROM SURESH_PRACTICE_USER";
		    List list = template.queryForList(sql);
		    System.out.println("****_DBSELECT query example_******"); 
		    System.out.println(list); 
		return list;
	}

	@Override
	public List<User> removeUser(String username) {
		// TODO Auto-generated method stub
		
		//System.out.println(query);		
		template.update("delete from SURESH_PRACTICE_USER where USERNAME=?",username);
		
		return allUsers();
	}

	@Override
	public int updateUser(String username) {
		// TODO Auto-generated method stub
		
		template.update("select USERNAME,PASSWORD,EMAIL,BIRTHDATE,PROFESSION from SURESH_PRACTICE_USER where USERNAME=?",username);

		return 0;
	}

}
