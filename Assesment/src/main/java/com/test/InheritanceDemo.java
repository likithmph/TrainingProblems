package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Books obj = new Books();
		obj.setB_name("Maths");
		obj.setB_author("RDSharma");
		obj.setB_genre("Study");
		obj.setB_price(1233);
		
		Story_Book tobj = new Story_Book();
		tobj.setPages("677");
		tobj.setB_name("Manga");
		tobj.setB_author("anime");
		tobj.setB_price(1522);
		
		
		session.persist(obj);
		
		session.persist(tobj);
		t.commit();
		System.out.println("Done");
	}

}
