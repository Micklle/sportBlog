package com.sport.blog.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sport.blog.dao.RoleDAO;
import com.sport.blog.dao.UserDAO;
import com.sport.blog.dto.UserDto;
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
	@Transactional
	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}

	@Transactional
	public List<UserDto> getUsers() {
		List<UserDto> dtos = new ArrayList<UserDto>();
		for (User user : userDao.getAllElements()) {
			dtos.add(new UserDto(user.getId(), user.getName(), user.getEmail()));
		}
		return dtos;
	}
	
	public void addPhoto(String userName, MultipartFile photo, String path) {
		File file = new File(path + "/resources/img/users/user_" + userName
				+ ".jpg");
		
		System.out.println(file.getAbsolutePath());
		try {
			file.createNewFile();
			photo.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
