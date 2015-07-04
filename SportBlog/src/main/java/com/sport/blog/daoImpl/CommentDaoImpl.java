package com.sport.blog.daoImpl;


import org.springframework.stereotype.Repository;



import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.CommentDAO;
import com.sport.blog.model.Comment;

@Repository
public class CommentDaoImpl extends GeneralDaoImpl<Comment> implements CommentDAO  {

	public CommentDaoImpl() {
		super(Comment.class);
	}
	
	@Transactional
	public Comment getCommentByText(String text) {
		return (Comment) entityManager.createQuery("select c from Ñomment as c where c.text = ?").setParameter(1, text).getSingleResult();
	}


	
}
