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
		String hql = "delete from Books where id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", 2);
		query.executeUpdate();
		t.commit();
	String hql1="from Books";
		Query<Books> q = session.createQuery(hql1 , Books.class);
				List<Books> list = q.getResultList();
				list.forEach(dt -> System.out.println(dt.getB_name()+" "+dt.getB_author()+" "+dt.getB_genre()));

	}

}
