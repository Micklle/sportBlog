package com.sport.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "rating")
public class Rating {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name = "id")
	private Long id;
	private Long user_id;
	private Long com_id;
	private Integer mark;
		
	
	public Long getId() {
		return id;
	}
	
	public Rating(){}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getCom_id() {
		return com_id;
	}
	public void setCom_id(Long com_id) {
		this.com_id = com_id;
	}
	public Integer getMark() {
		return mark;
	}
	public void setMark(Integer mark) {
		this.mark = mark;
	}
	
	
	
}
