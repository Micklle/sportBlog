package com.sport.blog.dao;

import com.sport.blog.model.Reward;

public interface RewardDAO {
	public Reward getRewardByMoney(Double money);
}
