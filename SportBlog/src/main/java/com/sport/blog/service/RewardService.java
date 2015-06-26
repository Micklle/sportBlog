package com.sport.blog.service;

import java.util.List;

import com.sport.blog.dto.RewardDTO;
import com.sport.blog.model.Reward;

public interface RewardService {
//	List<Reward> getAllReward();
	
	List<RewardDTO> getAllReward();
	
	
	Reward getRewardInfo(Integer RewardId);
	
	void saveReward (Double money);
}

