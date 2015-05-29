package com.sport.blog.daoImpl;

import org.hibernate.Session;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.User;
import com.sport.blog.util.HibernateUtil;

public class UserDaoImpl extends GeneralDaoImpl<User> implements UserDAO{

	public UserDaoImpl() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	public User getUserByName(String name) {
		Session session = null;
		session = HibernateUtil.getSessionFactory().openSession();
		User user = null;		
		user = (User) session.createSQLQuery("select * from user as u where u.name = ?").addEntity(User.class).setParameter(0, name);
		session.close();
		return user;
	}
	public User getByID(Integer id){
		User user = null;
		Session session = null;
		session = HibernateUtil.getSessionFactory().openSession();
		user = (User) session.createSQLQuery("select * from user where id = ?").addEntity(User.class).setParameter(0, id);
		return user;
	}
	
}
