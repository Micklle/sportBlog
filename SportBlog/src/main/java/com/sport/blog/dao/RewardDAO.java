package com.sport.blog.dao;

import com.sport.blog.model.Reward;

public interface RewardDAO extends GeneralDAO<Reward> {
	public Reward getRewardByMoney(Double money);
}
