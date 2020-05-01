package com.norha.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	@Pointcut("target(com.norha.cars.ElectricCar)")
	public void targetPointcut() {
	}
	@Pointcut("@annotation(Deprecated)")
	public void annotationPointcut() {
	}
	@Pointcut("within(com.norha.cars.*)")
	public void withinPointcut() {
	}

	@Before("!annotationPointcut() && withinPointcut()")
	public void CombinationAdvice() {
		System.out.println("Combination Advice ");
	}


}
