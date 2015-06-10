package com.sport.blog.dao;

import java.util.List;

import com.sport.blog.model.HashTag;

public interface HashTagDAO extends GeneralDAO<HashTag>{
	public HashTag getHashTagByName(String name);

	public  List<HashTag> getAllElements();

}
