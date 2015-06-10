package com.sport.blog.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sport.blog.dao.PostDAO;
import com.sport.blog.model.Post;
import com.sport.blog.model.Role;
import com.sport.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	@Inject
	private PostDAO postdao;

	@Override
	public List<Post> getAllPosts() {

		return postdao.getAllElements();
	}

	@Override
	public Post getPostByText(String text) {
		Post post = postdao.getPostByText(text);
		if (post != null)
			return postdao.getPostByText(text);
		else
			return new Post();
	}

	@Override
	public Post getPostByTitle(String title) {
		Post post = postdao.getPostByTitle(title);
		if (post != null)
			return postdao.getPostByTitle(title);
		else
			return new Post();
	}

	@Override
	public void savePost(String text, String title) {
		postdao.addElement(new Post(text, title));

	}
}
