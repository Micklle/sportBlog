package com.sport.blog.daoImpl;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.Session;

import com.sport.blog.dao.HashTagDAO;
import com.sport.blog.model.HashTag;
import com.sport.blog.model.User;


public class HashTagDaoImpl extends GeneralDaoImpl<HashTag>  implements HashTagDAO{
	
	public HashTagDaoImpl() {
		super(HashTag.class);
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public HashTag getHashTagByName(String name) {
		return (HashTag) entityManager.createQuery("select u from HashTag as u where u.name = ?").setParameter(0, name).getSingleResult();
	}
	

}
