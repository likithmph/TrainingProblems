package com.test;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import org.hibernate.Transaction;
public class CriteriaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Books> cq = cb.createQuery(Books.class);
		cq.distinct(true);
		Root<Books> rt = cq.from(Books.class);
				cq.select(rt);
		TypedQuery<Books> tq =session.createQuery(cq);
		List<Books> list = tq.getResultList();
		System.out.println(list);
	}

}
