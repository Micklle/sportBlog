package com.sport.blog.service;

import java.util.List;

import com.sport.blog.model.HashTag;


public interface HashtagService {
	List<HashTag> getAllHashTags();

	HashTag getHashTagName(String name);

	void saveHashTag(String name);
}
