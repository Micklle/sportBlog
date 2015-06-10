package com.sport.blog.service;

import java.util.List;

import com.sport.blog.model.Role;

public interface RoleService {
	List<Role> getAllRoles();
	
	Role getRoleInfo(Integer roleId);
	
	void saveRole(String roleName);
}
