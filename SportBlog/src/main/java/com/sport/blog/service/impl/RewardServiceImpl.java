package com.sport.blog.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sport.blog.dao.RewardDAO;
import com.sport.blog.model.Reward;
import com.sport.blog.service.RewardService;


@Service
public class RewardServiceImpl implements RewardService{
	
	@Inject
	private RewardDAO rewardDAO;
	
	@Override
	public List<Reward> getAllReward() {
		return rewardDAO.getAllElements();
	}
	
	@Override
	public Reward getRewardInfo(Integer rewardId) {
		Reward reward = rewardDAO.getElementByID(rewardId);
		if (reward != null)
			return rewardDAO.getElementByID(rewardId);
		else
			return new Reward();
	}

	@Override
	public void saveReward(Double money) {
		rewardDAO.addElement(new Reward(money));
	}
	
}
