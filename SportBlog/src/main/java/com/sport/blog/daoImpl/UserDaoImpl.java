package com.sport.blog.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.User;
import com.sport.blog.util.HibernateUtil;

public class UserDaoImpl extends GeneralDaoImpl<User> implements UserDAO{

	public User getUserByName(User name) {
		Session session = null;
		User user = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			user = (User) session.get(User.class, (Serializable) name);
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return user;
	}

}
