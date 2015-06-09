package com.sport.blog.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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
	public User getByID(Integer id){
		return (User) entityManager.createQuery("select u from user as u where u.id = ?").setParameter(0, id).getSingleResult();
	}
	@Transactional
	public List<User> getByRoleName(String name) {
		return entityManager.createQuery("SELECT * FROM test.user as u where role_id=(select id from role where name = ?)").setParameter(0, name).getResultList();
	}
	
}
