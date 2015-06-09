package com.sport.blog.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sport.blog.dao.RoleDAO;
import com.sport.blog.model.Role;
import com.sport.blog.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Inject
	private RoleDAO roleDAO;

	@Override
	public List<Role> getAllRoles() {
		return roleDAO.getAllElements();
	}

	@Override
	public Role getRoleInfo(Integer roleId) {
		Role role = roleDAO.getElementByID(roleId);
		if (role != null)
			return roleDAO.getElementByID(roleId);
		else
			return new Role();
	}

	@Override
	public void saveRole(String roleName) {
		roleDAO.addElement(new Role(roleName));
	}

}
