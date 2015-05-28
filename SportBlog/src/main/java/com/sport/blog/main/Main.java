package com.sport.blog.main;

import com.sport.blog.daoImpl.PostDaoImpl;
import com.sport.blog.daoImpl.UserDaoImpl;
import com.sport.blog.model.Post;
import com.sport.blog.model.User;

public class Main {

	public static void main(String[] args) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
	
		User u = userDaoImpl.getElementByID(1);
		System.out.println(u.getName());
//		User user = new User("Oleg", "454545");
//		userDaoImpl.addElement(user);
//		System.out.println("Finish");
	}
}
