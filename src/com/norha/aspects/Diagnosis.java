package com.norha.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	@Pointcut("bean(petrolCar)")
	public void beanPointcut() {
	}

	@Before("beanPointcut()")
	public void beanAdvice() {
		System.out.println("Bean Advice");
	}


}
