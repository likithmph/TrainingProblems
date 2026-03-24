package com.test;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class StoreCust {public StoreCust() {
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		 
		//Configuration ci = new Configuration();
		//ci.configure("hibernate.ci.xml");
		SessionFactory sf= HibernateUtil.getSession();
		Session session = sf.openSession();
		
		
		Transaction t = session.beginTransaction();
		Customer c = new Customer();
		c.setName("Likith");
		c.setCity("Bangalore");
		session.persist(c);
		t.commit();
		
		
		List<Customer> list = session.createQuery("from Customer",Customer.class).list();
		list.forEach(dt -> System.out.println(dt.getId()+" "+dt.getName()+" "+dt.getCity()));
		
		
		
		
		//Customer obj = session.find(Customer.class,2);
		//System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getCity());
		
	
		//session.persist(emp);
		//session.remove(obj);
		
		   
		
		
		System.out.println("Done.");
		
	}

}
