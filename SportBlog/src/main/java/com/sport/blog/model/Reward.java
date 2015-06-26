package com.sport.blog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="reward")
public class Reward {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reward_id")
	private Long reward_id;

	private Double money;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User id;
	
	
//	private List<User> user;
	public Reward() {	}
	
	public Reward (Double money) {
		this.money = money;
	}
	
	public Long getReward_id() {
		return reward_id;
	}

	public void setReward_id(Long reward_id) {
		this.reward_id = reward_id;
	}

	public User getId() {
		return id;
	}
	
	public void setId(User id) {
		this.id = id;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

//	public List<User> getUser() {
//		return user;
//	}
//
//	public void setUser(List<User> user) {
//		this.user = user;
//	}


}
