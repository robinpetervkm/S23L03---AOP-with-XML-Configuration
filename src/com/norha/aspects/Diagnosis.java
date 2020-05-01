package com.norha.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Diagnosis {

	 @Pointcut("execution(void run(int))") 
	public void run() {
	}

	@Before("run()")
	public void testAdvice(JoinPoint jp) {
		
		/*
		 * System.out.println("JP : "+jp.toString()); PertolCar car = (PertolCar)
		 * jp.getTarget(); car.run(100,50);
		 */
		
		for(Object ob :jp.getArgs()) {
			System.out.println("Args "+ob);
		}
		
		
		System.out.println("Test Advice");
	}

}
