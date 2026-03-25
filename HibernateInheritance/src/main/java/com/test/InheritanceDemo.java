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
		Vehicle obj = new Vehicle();
		obj.setV_name("car");
		obj.setL_no(123321);
		
		TwoWheeler tobj = new TwoWheeler();
		tobj.setV_name("CBR1000rrr");
		tobj.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler fobj = new FourWheeler();
		fobj.setV_name("AUDI");
		fobj.setSteeringWheel("Manual driving ");
		session.persist(obj);
		session.persist(fobj);
		session.persist(tobj);
		t.commit();
		System.out.println("Done");
	}

}
