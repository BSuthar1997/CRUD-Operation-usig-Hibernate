package com.hibernate.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.util.HibernateUtil;

public class DeleteUser {

	public void deleteUserData(String id) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();

		String sql = "delete from USER_TABLE where id=" + id;

		SQLQuery query = session.createSQLQuery(sql);
		
		query.addEntity(User.class);
		
		query.executeUpdate();

		transaction.commit();

	}

}
