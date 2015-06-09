package com.sport.blog.dao;

import com.sport.blog.model.Role;

public interface RoleDAO extends GeneralDAO<Role> {
	
	public Role getRoleByName(String name);
}
