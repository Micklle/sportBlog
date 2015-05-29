package com.sport.blog.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;

import com.sport.blog.dao.RoleDAO;
import com.sport.blog.model.Role;
import com.sport.blog.util.HibernateUtil;

public class RoleDaoImpl extends GeneralDaoImpl<Role> implements RoleDAO{

	public RoleDaoImpl() {
		super(Role.class);
		// TODO Auto-generated constructor stub
	}

	public Role getRoleByName(Role name) {
		Session session = null;
		session = HibernateUtil.getSessionFactory().openSession();
		Role role = null;
		role = (Role) session.createQuery("select * from role as r where r.name = ?").setParameter(0, name);
		session.close();
		return role;
	}
	
}
