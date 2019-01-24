package com.hibernate.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.util.HibernateUtil;

public class DisplayList {

	@SuppressWarnings("unused")
	public List<User> getAll() {

		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		String sql = "select * from USER_TABLE;";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(User.class);

		@SuppressWarnings("unchecked")
		List<User> list = query.list();

		return list;
	}

}
