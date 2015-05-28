package com.sport.blog.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;

import com.sport.blog.dao.HashTagDAO;
import com.sport.blog.model.HashTag;
import com.sport.blog.util.HibernateUtil;

public class HashTagDaoImpl extends GeneralDaoImpl<HashTag>  implements HashTagDAO{

	public HashTag getHashTagByName(HashTag name) {
		Session session = null;
		HashTag hash = null;
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			hash= (HashTag) session.get(HashTag. class, (Serializable) name);
		} finally{
			if((session!=null) && (session.isOpen())){
				session.close();
			}
		}
		
		return hash;
	}

}
