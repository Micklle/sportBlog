package com.sport.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.PostDAO;
import com.sport.blog.dao.UserDAO;
import com.sport.blog.dto.PostsDTO;
import com.sport.blog.model.HashTag;
import com.sport.blog.model.Post;
import com.sport.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	@Inject
	private PostDAO postdao;
	@Inject
	private UserDAO userdao;

	@Transactional
	public List<PostsDTO> getAllPosts() {
		 List<PostsDTO> dtos = new ArrayList<PostsDTO>();
		 
		 for(Post post : postdao.getAllElements()){
			 List<String> hashTags = new ArrayList<String>();
			 
			 for(HashTag hashTag : post.getHashTags()){
				 hashTags.add(hashTag.getName());
			 }
			 
			 String name = userdao.getUserByEmail("qwe").getName();
			 
			 
			 dtos.add(new PostsDTO(post.getTitle(), post.getText(), hashTags, name));
		 }
		 return dtos;
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
