package com.sport.blog.main;

import java.util.List;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.daoImpl.GeneralDaoImpl;
import com.sport.blog.daoImpl.PostDaoImpl;
import com.sport.blog.daoImpl.RoleDaoImpl;
import com.sport.blog.daoImpl.UserDaoImpl;
import com.sport.blog.model.Post;
import com.sport.blog.model.Role;
import com.sport.blog.model.User;

public class Main {

	public static void main(String[] args) {
		UserDAO userDaoImpl = new UserDaoImpl();
		RoleDaoImpl roleDaoImpl = new RoleDaoImpl();
		
//		Role role1 = new Role("admin");
//		Role role2 = new Role("user");
//		roleDaoImpl.addElement(role1);
//		roleDaoImpl.addElement(role2);
//	
//		User user1 = new User("Oleg", "454545", role1);
//		User user2 = new User("Vlad", "454545", role2);
//		userDaoImpl.addElement(user1);
//		userDaoImpl.addElement(user2);
		
		User u = userDaoImpl.getElementByID(1);
		System.out.println(u.getName());
		
		System.out.println("Finish");
	}
}
