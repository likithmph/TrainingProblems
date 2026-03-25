package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Movie mobj = new Movie();
		mobj.setM_name("M3");
		mobj.setM_location("Bangalore");
		Movie_2D ob = new Movie_2D();
		ob.setM_name("Jackson");
		ob.setCasting("MJ");
		
		Movie_8D obj = new Movie_8D();
		obj.setM_name("Andrew");
		obj.setDirecor("Mark");
		
		session.persist(obj);
		session.persist(ob);
		session.persist(mobj);
		t.commit();
		System.out.println("Done");
		session.close();
	}

}
