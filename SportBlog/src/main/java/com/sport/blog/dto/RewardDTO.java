package com.sport.blog.dto;

import java.util.List;

public class RewardDTO {
	private String user;

	private Double money;

	public RewardDTO() {
	}

	public RewardDTO(Double money, String user) {
		// public RewardDTO( Double money, List<String> user) {
		// this.name = name;
		this.user = user;
		this.money = money;
	}

	/**
	 * @return the users
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the money
	 */
	public Double getMoney() {
		return money;
	}

	/**
	 * @param money
	 *            the money to set
	 */
	public void setMoney(Double money) {
		this.money = money;
	}

}
