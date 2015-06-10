package com.sport.blog.dao;

import com.sport.blog.model.Post;

public interface PostDAO extends GeneralDAO<Post>{
	public Post getPostByText(String name);
    public Post getPostByTitle(String title);
}
