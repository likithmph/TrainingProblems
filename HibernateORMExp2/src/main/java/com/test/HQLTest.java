package com.test;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = Hibernate.getSession().openSession();
		Transaction t = session.beginTransaction();
		//String hql1="select o.O_name , O_quantity , O_price from Order o";
		String hql = "delete from Order where id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", 102);
		query.executeUpdate();
		t.commit();
	String hql1="from Order";
		Query<Order> q = session.createQuery(hql1 , Order.class);
				List<Order> list = q.getResultList();
				list.forEach(dt -> System.out.println(dt.getO_name()+" "+dt.getO_quantity()+" "+dt.getO_price()));

	}

}
