package com.sport.blog.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.User;

@Repository
public class UserDaoImpl extends GeneralDaoImpl<User> implements UserDAO{

	public UserDaoImpl() {
		super(User.class);
	}
	@Transactional
	public User getUserByName(String name) {
		return (User) entityManager.createQuery("select u from user as u where u.name = ?").setParameter(0, name).getSingleResult();
	}
	@Transactional
	public User getUserByEmail(String email) {
		return (User) entityManager.createQuery("select u from user as u where u.email = ?").setParameter(0, email).getSingleResult();
	}
	@Transactional
	public User getByID(Integer id){
		return (User) entityManager.createQuery("select u from user as u where u.id = ?").setParameter(0, id).getSingleResult();
	}
	@Transactional
	public List<User> getByRoleName(String name) {
		return (List<User>) entityManager.createQuery("SELECT u FROM user as u where role_id=(select id from role where name = ?)").setParameter(0, name).getResultList();
	}
	@Transactional
	public List<User> getByRoleId(Integer id) {
		return (List<User>) entityManager.createQuery("select u FROM user as u where u.role_id = ?").setParameter(0, id).getResultList();
	}
	
}
