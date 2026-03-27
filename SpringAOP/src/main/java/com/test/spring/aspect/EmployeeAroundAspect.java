package com.test.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAroundAspect {
	@Around("execution (* com.test.model.Employee.ssssgetName())")
public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
	System.out.println("before invoking getName() method" );
	Object value = null;
	try {
		value = proceedingJoinPoint.proceed();
		
	}
	catch (Throwable e) {
		// TODO: handle exception
		e.printStackTrace();
	}

	
	System.out.println("After invoking getName() method");
	return value;
	
	}
}
