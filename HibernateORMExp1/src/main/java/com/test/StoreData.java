package com.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class StoreData {public StoreData() {
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction t = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmp_name("Likith");
		emp.setEmp_company("BCC");
		emp.setEmp_city("Bangalore");
		session.persist(emp);
		t.commit();
		Employee obj = session.find(Employee.class,102);
		System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city());
		
		//Employee obj = session.find(Employee.class,3);
		
		emp.setEmp_name("Likith2");
		emp.setEmp_company("BCCC");
		emp.setEmp_city("Bangalore");
		//session.persist(emp);
		//session.remove(obj);
		
		
		
		
		System.out.println("Done.");
		
	}

}
