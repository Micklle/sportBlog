package com.sport.blog.dao;

import java.util.List;

import com.sport.blog.model.User;

public interface UserDAO extends GeneralDAO<User> {
	
	public User getUserByName(String name);
	public User getUserByEmail(String email);
	public User getByID(Integer id);
	public List<User> getByRoleName(String name);
	public List<User> getByRoleId(Integer id);
}	
