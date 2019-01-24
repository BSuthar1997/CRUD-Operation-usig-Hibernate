package com.hibernate.service;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.util.HibernateUtil;

public class LoginService {

	final static Logger logger = Logger.getLogger(LoginService.class);

	public boolean authenticateUser(String userId, String password) {
		User user = getUserByUserId(userId);
		logger.debug("userId::" + userId);
		logger.debug("password::" + password);
		if (user != null && user.getUserId().equals(userId) && user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public User getUserByUserId(String userId) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		User user = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			Query query = session.createQuery("from User where userId='" + userId + "'");
			user = (User) query.uniqueResult();
			logger.debug("user:::::::" + user);
			logger.info("User Fetched:=>" + user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}
}
