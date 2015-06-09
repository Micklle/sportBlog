package com.sport.blog.service;

import java.util.List;

import com.sport.blog.model.User;


public interface UserService {
	List<User> getAllUsers();
	
	User getUserInfo(Integer userId);
	
	void saveUser(String userName, String password);
	
}
