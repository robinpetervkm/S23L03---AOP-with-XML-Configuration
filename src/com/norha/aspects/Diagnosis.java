package com.norha.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Diagnosis {

	 @Pointcut("target(com.norha.cars.PertolCar)") 
	public void targetPointcut() {
	}

	@Before("targetPointcut()")
	public void targetAdvice() {
		System.out.println("target Advice"); 
	}
	
	/*
	 * @Pointcut("execution (void run())") public void thisPointcut() { }
	 * 
	 * @Before("thisPointcut()") public void thisAdvice() {
	 * System.out.println("this Advice"); }
	 */
}
