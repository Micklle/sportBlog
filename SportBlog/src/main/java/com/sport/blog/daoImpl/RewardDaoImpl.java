package com.sport.blog.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.RewardDAO;
import com.sport.blog.model.Reward;

@Repository
public class RewardDaoImpl extends GeneralDaoImpl<Reward> implements RewardDAO{

	public RewardDaoImpl() {
		super(Reward.class);
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public Reward getRewardByMoney(Double money) {
		return (Reward) entityManager.createQuery("select * from Reward").setParameter(1, money).getSingleResult();
	}

}
