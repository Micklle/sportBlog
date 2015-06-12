package com.sport.blog.service;

import java.util.List;

import com.sport.blog.model.User;


public interface UserService {
	List<User> getAllUsers();
	
	List<User> getUsers(Integer id);
	
	List<User> getAdmins(Integer id);
	
	User getUserInfo(Integer userId);
	
	void saveUser(String userName, String userEmail, String password);
	
}
