package com.sport.blog.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.RoleDAO;
import com.sport.blog.model.Role;
@Repository
public class RoleDaoImpl extends GeneralDaoImpl<Role> implements RoleDAO{

	public RoleDaoImpl() {
		super(Role.class);
	}
	@Transactional
	public Role getRoleByName(String name) {
		return (Role) entityManager.createQuery("select r from Role as r where r.name = ?").setParameter(1, name).getSingleResult();
	}
}