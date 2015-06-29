package com.sport.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.RewardDAO;
import com.sport.blog.dao.UserDAO;
import com.sport.blog.dto.RewardDTO;
import com.sport.blog.model.Reward;
import com.sport.blog.model.User;
import com.sport.blog.service.RewardService;


@Service
public class RewardServiceImpl implements RewardService{
	
	@Inject
	private RewardDAO rewardDAO;
	@Inject
	private UserDAO userDao;
	

	@Override
	public List<RewardDTO> getAllReward() {
		List<RewardDTO> r = new ArrayList<RewardDTO>();
		for (Reward reward : rewardDAO.getAllElements()) {
			
				r.add(new RewardDTO(reward.getMoney(), reward.getId().getName()));
			
			}
		return r; 
		
		}

	
	
//	@Override
//	public List<RewardDTO> getAllReward() {
//		List<RewardDTO> r = new ArrayList<RewardDTO>();
//		for (Reward reward : rewardDAO.getAllElements()) {
//			 List<String> users = new ArrayList<String>();
//			
//			 for (User user : reward.getUser()) {
//				users.add(user.getName());
//			
//				
////			for (User user : userDao.getAllElements()) {
////				r.add(new RewardDTO(user.getName(), reward.getMoney()));
//			}
//			 r.add(new RewardDTO( reward.getMoney(), users));
//		}
//		return r; 
//		
//		}
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
