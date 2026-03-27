package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
public static void main(String[] args) {
//	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//	Employee obj = ctx.getBean("emp",Employee.class);
//	System.out.println(obj);
//	Employee obj1 =(Employee) ctx.getBean("emp1",Employee.class);
//	System.out.println(obj1);
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnConfig.class);
	Employee obj1 = ctx.getBean("getSetterObj",Employee.class);
	obj1.setName("rohith");
	obj1.setCompany("BCCi");
	obj1.setId(101);
	System.out.println("SetterInjection :"+obj1);
	Employee obj2 = ctx.getBean("getConstructorObj",Employee.class);
	System.out.println("ConstructorInjection : "+obj2);
}
}
