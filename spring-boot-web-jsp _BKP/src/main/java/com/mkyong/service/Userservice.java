package com.mkyong.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkyong.bean.User;

public interface Userservice {
	public void adduser(User user);
	
	public List<User> allUsers();
	 public List<User> removeUser(String username);
	 public int updateUser(String username);

}
