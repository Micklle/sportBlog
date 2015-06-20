package com.sport.blog.daoImpl;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.HashTagDAO;
import com.sport.blog.model.HashTag;

@Repository
public class HashTagDaoImpl extends GeneralDaoImpl<HashTag>  implements HashTagDAO{
	
	public HashTagDaoImpl() {
		super(HashTag.class);
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public HashTag getHashTagByName(String name) {
		return (HashTag) entityManager.createQuery("select u from HashTag as u where u.name = ?").setParameter(1, name).getSingleResult();
	}
	

}
