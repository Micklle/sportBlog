package com.sport.blog.dao;

import com.sport.blog.model.Post;

public interface PostDAO {
	public Post getPostByText(String name);
    public Post getPostByTitle(String title);
}
