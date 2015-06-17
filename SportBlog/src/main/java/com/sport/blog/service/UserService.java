package com.sport.blog.service;

import java.util.List;

import com.sport.blog.model.User;


public interface UserService {
	List<User> getAllUsers();
	
	List<User> getUserByRoleId(Integer id);
	
	User getUserByName(String name);
	
	User getUserInfo(Integer userId);
	
	void saveUser(String userName, String userEmail, String password);
	
}
