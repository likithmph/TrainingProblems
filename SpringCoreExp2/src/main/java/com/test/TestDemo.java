package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		Employee obj = ctx.getBean("emp",Employee.class);
//		System.out.println(obj);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnConfig.class);
		Address add1 = ctx.getBean("getAddObj",Address.class);
		add1.setCity("Hyd");
		add1.setState("Telangana");
		Address add2 = ctx.getBean("getAddObj",Address.class);
		add2.setCity("Blr");
		add2.setState("KA");
		List<Address> list = Arrays.asList(add1,add2);
		Employee emp =ctx.getBean("getEmployeeObj",Employee.class);
		emp.setId(2);
		emp.setName("Likith");
		emp.setCompany("Bcc");
		emp.setAdd(list);
		System.out.println(emp);
	}

}
