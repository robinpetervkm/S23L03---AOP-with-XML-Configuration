package com.norha.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void targetPointcut() {
	}

	@Before("targetPointcut()")
	public void targetAdvice() {
		System.out.println("@target Advice ");
	}

	/*
	 * @Pointcut("@annotation(Deprecated)") public void annotationPointcut() { }
	 * 
	 * @Before("annotationPointcut()") public void annotationAdvice() {
	 * System.out.println("@annotation Advice "); }
	 */

}
