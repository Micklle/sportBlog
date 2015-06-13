package com.sport.blog.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.PostDAO;
import com.sport.blog.model.Post;

@Repository
public class PostDaoImpl extends GeneralDaoImpl <Post> implements PostDAO{
	
	public PostDaoImpl() {
		super(Post.class);
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public Post getPostByText(String name) {
		return (Post) entityManager.createQuery("select u from Post as u where u.name = ?").setParameter(0, name).getSingleResult();
	}
	@Transactional
	public Post getPostByTitle(String title) {
		return (Post) entityManager.createQuery("select u from user as u where u.title = ?").setParameter(0, title).getSingleResult();
	}

}
