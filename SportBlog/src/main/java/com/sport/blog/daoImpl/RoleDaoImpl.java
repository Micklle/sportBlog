package com.sport.blog.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;

import com.sport.blog.dao.RoleDAO;
import com.sport.blog.model.Role;
import com.sport.blog.util.HibernateUtil;

public class RoleDaoImpl extends GeneralDaoImpl<Role> implements RoleDAO{

	public Role getRoleByName(Role name) {
		Session session = null;
		Role role = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			role = (Role) session.get(Role.class, (Serializable) name);
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return role;
	}
	
}
