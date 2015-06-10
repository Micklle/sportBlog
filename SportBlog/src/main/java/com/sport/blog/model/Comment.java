package com.sport.blog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;
		private Long post_id;
		private Long user_id;
		private String text;
		
		@OneToMany
		@JoinColumn (name = "com_id")
		private List<Rating> ratings;
		
		
		
		public Comment(){}
		
		public List<Rating> getRating() {
			return ratings;
		}

		public void setRating(List<Rating> ratings) {
			this.ratings = ratings;
		}

		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		public Long getPost_id() {
			return post_id;
		}
		public void setPost_id(Long post_id) {
			this.post_id = post_id;
		}
		public Long getUser_id() {
			return user_id;
		}
		public void setUser_id(Long user_id) {
			this.user_id = user_id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
		
}

