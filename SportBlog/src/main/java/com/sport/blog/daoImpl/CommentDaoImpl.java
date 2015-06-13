package com.sport.blog.daoImpl;


import org.springframework.stereotype.Repository;



import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.CommentDAO;
import com.sport.blog.model.Comment;

@Repository
public class CommentDaoImpl extends GeneralDaoImpl<Comment> implements CommentDAO  {

	public CommentDaoImpl() {
		super(Comment.class);
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public Comment getCommentByText(String text) {
		// TODO Auto-generated method stub
		return (Comment) entityManager.createQuery("select c from comment as c where c.text = ?").setParameter(0, text).getSingleResult();
	}


	
}
