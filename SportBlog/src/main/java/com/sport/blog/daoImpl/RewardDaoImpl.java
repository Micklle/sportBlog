/*package com.sport.blog.daoImpl;

import org.hibernate.Session;

import com.sport.blog.dao.RewardDAO;
import com.sport.blog.model.Reward;
import com.sport.blog.util.HibernateUtil;


public class RewardDaoImpl extends GeneralDaoImpl<Reward> implements RewardDAO{

	public RewardDaoImpl(Class<Reward> elementClass) {
		super(Reward.class);
		// TODO Auto-generated constructor stub
	}

	public Reward getRewardByMoney(Double money) {
//		// TODO Auto-generated method stub
		Session session = null;
		session = HibernateUtil.getSessionFactory().openSession();
		Reward reward = null;		
		reward = (Reward) session.createSQLQuery("select * from reward").addEntity(Reward.class).setParameter(0, money);
		session.close();
		return reward;
		
	}

}*/
