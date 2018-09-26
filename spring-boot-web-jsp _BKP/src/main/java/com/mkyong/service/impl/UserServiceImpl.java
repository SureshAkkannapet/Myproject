package com.mkyong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.bean.User;
import com.mkyong.dao.UserDao;
import com.mkyong.service.Userservice;


@Service
public class UserServiceImpl implements Userservice{
    
	@Autowired
	UserDao userdao;
	@Override
	public void adduser(User user) {
		// TODO Auto-generated method stub
		userdao.adduser(user);
		
	}

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		List<User> all=userdao.allUsers();
		return all;
	}

	@Override
	public List<User> removeUser(String username) {
		// TODO Auto-generated method stub
		List<User> li=userdao.removeUser(username);
		return li;
	}

	@Override
	public int updateUser(String username) {
		// TODO Auto-generated method stub
		int i=userdao.updateUser(username);
		return i;
	}

}
