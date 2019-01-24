package com.hibernate.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.util.HibernateUtil;

public class UpdateUser {
	final static Logger logger = Logger.getLogger(UpdateUser.class);

	public void updateUserData(String id, User user2) {
		Session session = HibernateUtil.openSession();
		if (isUserExists(user2)) {
			// Session session = sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			tx.begin();
			int id1 = Integer.parseInt(id);
			User user = (User) session.get(User.class, id1);
			//
			String email = (String) user2.getEmail();
			String firstName = (String) user2.getFirstName();
			String lastName = (String) user2.getLastName();
			String middleName = (String) user2.getMiddleName();
			String userId = (String) user2.getUserId();
			String password = (String) user2.getPassword();
			//

			user.setUserId(userId);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmail(email);
			user.setMiddleName(middleName);
			user.setPassword(password);

			session.saveOrUpdate(user);

			tx.commit();
			session.close();

			// User user = new User("firstName","middleName","lastName","
			// email","userId", "password");

		} else {
			logger.error("same data");

		}
		// return false;
	}

	public boolean isUserExists(User user) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from User where userId='" + user.getUserId() + "'");
			User u = (User) query.uniqueResult();
			tx.commit();
			if (u != null)
				result = true;
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

}
