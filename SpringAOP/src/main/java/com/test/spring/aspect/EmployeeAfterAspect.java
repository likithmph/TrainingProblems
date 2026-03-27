package com.test.spring.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	@After("arg(name)")
	public void longStringArguments(String name) {
		System.out.println("Running after advice string argument passes");
	}
	@AfterThrowing("within(com.test.model.Employee)")
	public void logException(Joinpoint joinpoint) {
		System.out.println("Exception throw in employee method :" +joinpoint.toString());
	}
	@AfterReturning(pointcut = "executing(* getName())", returning = "returnstring")
	public void getNameReturningAdvice(String returnstring) {
		System.out.println("getNameReturning advice :"+returnstring);
	}
}
