package com.sport.blog.dao;

import com.sport.blog.model.Comment;


public interface CommentDAO extends GeneralDAO<Comment>{
	public Comment getCommentByText(String text);
	
}
