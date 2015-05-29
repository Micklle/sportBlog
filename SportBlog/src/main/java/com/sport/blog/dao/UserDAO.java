package com.sport.blog.dao;

import com.sport.blog.model.User;

public interface UserDAO extends GeneralDAO<User> {
	public User getUserByName(String name);
}	
