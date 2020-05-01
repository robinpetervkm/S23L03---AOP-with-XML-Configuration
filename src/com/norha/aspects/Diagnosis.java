package com.norha.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Diagnosis {

	 @Pointcut("args(int,int))") 
	public void run() {
	}

	@Before("run()")
	public void testAdvice(JoinPoint jp) {
		System.out.println("Test Advice"); 
	}

}
