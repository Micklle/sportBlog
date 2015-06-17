package com.sport.blog.dto;

import java.util.List;

public class PostsDTO {

	private String title;
	private String text;
	private List<String> hashTags;
	private String author;

	public PostsDTO() {
	}

	public PostsDTO(String title, String text, List<String> hashTags, String author) {
		this.title = title;
		this.text = text;
		this.hashTags = hashTags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getHashTags() {
		return hashTags;
	}

	public void setHashTags(List<String> hashTags) {
		this.hashTags = hashTags;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
