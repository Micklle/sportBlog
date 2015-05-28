package com.sport.blog.daoImpl;

import org.hibernate.Session;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.User;
import com.sport.blog.util.HibernateUtil;

public class UserDaoImpl extends GeneralDaoImpl<User> implements UserDAO{

	public User getUserByName(User name) {
		Session session = null;
		session = HibernateUtil.getSessionFactory().openSession();
		User user = null;		
		user = (User) session.createQuery("select * from user as u where u.name = ?").setParameter(0, name);
		session.close();
		return user;
	}

}
