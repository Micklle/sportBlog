package com.sport.blog.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sport.blog.dao.RoleDAO;
import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.Role;
import com.sport.blog.model.User;
import com.sport.blog.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO userDao;
	@Inject
	private RoleDAO roleDao;

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllElements();
	}

	@Override
	@Transactional
	public List<User> getUserByRoleId(Integer id) {
		return userDao.getByRoleId(id);
	}

	@Override
	@Transactional
	public User getUserInfo(Integer userId) {
		return userDao.getElementByID(userId);
	}

	@Override
	@Transactional
	public void saveUser(String userName, String userEmail, String password) {
		userDao.addElement(new User(userName, userEmail, password, roleDao.getRoleByName("user")));
	}

	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}

}
