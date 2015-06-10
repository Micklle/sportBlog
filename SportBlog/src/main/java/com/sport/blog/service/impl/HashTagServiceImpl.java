package com.sport.blog.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sport.blog.dao.HashTagDAO;
import com.sport.blog.model.HashTag;
import com.sport.blog.model.Role;
import com.sport.blog.service.HashtagService;

@Service
public class HashTagServiceImpl implements HashtagService {
	@Inject
	private HashTagDAO hashtagDao;

	@Override
	public List<HashTag> getAllHashTags() {
		return hashtagDao.getAllElements();
	}

	@Override
	public HashTag getHashTagName(String name) {
		HashTag hash = hashtagDao.getHashTagByName(name);
		if (hash != null)
			return hashtagDao.getHashTagByName(name);
		else
			return new HashTag();
	}

	@Override
	public void saveHashTag(String name) {
		hashtagDao.addElement(new HashTag(name));

	}

}
