package com.sport.blog.service;

import java.util.List;

import com.sport.blog.dto.PostsDTO;
import com.sport.blog.model.Post;

public interface PostService {
	List<PostsDTO> getAllPosts();

	Post getPostByText(String name);

	Post getPostByTitle(String title);

	void savePost(String name, String title);
}
