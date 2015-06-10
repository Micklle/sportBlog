package com.sport.blog.dao;

import com.sport.blog.model.Rating;


public interface RatingDAO extends GeneralDAO<Rating> {
	public Rating getRatingByMark (Integer mark);
}
