package com.sport.blog.daoImpl;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.User;

@Repository
public class UserDaoImpl extends GeneralDaoImpl<User> implements UserDAO {

	public UserDaoImpl() {
		super(User.class);
	}

	@Transactional
	public User getUserByName(String name) {
		return (User) entityManager
				.createQuery("select e from User e where e.name = :name")
				.setParameter("name", name).getSingleResult();
	}

	@Transactional
	public User getUserByEmail(String email) {
		try {
			return (User) entityManager
					.createQuery(
							"select u from User as u where u.email = :email")
					.setParameter("email", email).getSingleResult();
		} catch (NoResultException e) {
			return new User();
		}
	}

	@Transactional
	public User getByID(Integer id) {
		try {
			return (User) entityManager
					.createQuery("select u from User as u where u.id = :id")
					.setParameter("id", id).getSingleResult();

		} catch (NoResultException e) {
			return new User();
		}
	}

	@Transactional
	public List<User> getByRoleName(String name) {
		return (List<User>) entityManager
				.createNativeQuery(
						"SELECT * FROM User as u where role_id=(select id from role where name = :name)")
				.setParameter("name", name).getResultList();
	}

	@Transactional
	public List<User> getByRoleId(Integer id) {
		return (List<User>) entityManager
				.createNativeQuery(
						"select * FROM user as u where u.role_id = :id")
				.setParameter("id", id).getResultList();
	}

}
