package com.mkyong.dao;

import java.util.List;

import com.mkyong.bean.User;

public interface UserDao {
	
	
		public void adduser(User user);
		
		public List<User> allUsers();
		 public List<User> removeUser(String username);
		 public int updateUser(String username);
		

	}

