package com.sport.blog.daoImpl;

import java.io.Serializable;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.sport.blog.dao.PostDAO;
import com.sport.blog.model.Post;
import com.sport.blog.util.HibernateUtil;

public class PostDaoImpl extends GeneralDaoImpl <Post> implements PostDAO{
	
	public PostDaoImpl() {
		super(Post.class);
		// TODO Auto-generated constructor stub
	}

	public Post getPostByText(Post name) {
		Session session= null;
		Post postName = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			postName = (Post) session.get(Post.class, (Serializable) name);
		}finally{
			if((session!=null) && (session.isOpen()))
				session.close();
		}
		return postName;
	}

	public Post getPostByTitle(Post title) {
		Session session = null;
		Post  postTitle= null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			postTitle = (Post) session.get(Post.class, (Serializable) title);
		}finally{
			if((session!=null) && (session.isOpen())){
				session.close();
			}
		}
		return postTitle;
	}

}
