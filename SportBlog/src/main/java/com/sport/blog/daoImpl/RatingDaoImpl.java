package com.sport.blog.daoImpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sport.blog.dao.RatingDAO;
import com.sport.blog.model.Rating;

@Repository
public class RatingDaoImpl extends GeneralDaoImpl <Rating> implements RatingDAO {

	public RatingDaoImpl() {
		super(Rating.class);
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public Rating getRatingByMark(Integer mark) {
		// TODO Auto-generated method stub
		return (Rating) entityManager.createQuery("select r from rating as r where r.mark = ?").setParameter(0, mark).getSingleResult();
	}

}
