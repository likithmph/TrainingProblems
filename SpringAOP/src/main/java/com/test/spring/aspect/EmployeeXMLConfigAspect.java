package com.test.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class EmployeeXMLConfigAspect {
	public Object employeeAroundAdvice(ProceedingJoinPoint joinpoint) {
		System.out.println("EmployeeXMLConfigAspect :: Before invoking getName()");
		
		Object value = null;
		try {
			value = joinpoint.proceed();
		}
		catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("EmployeXMLConficAspec :: After invoking getName()");
		return value;
		
	}
}
