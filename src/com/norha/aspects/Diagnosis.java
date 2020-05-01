package com.norha.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	@Pointcut("within(@org.springframework.stereotype.Component com.norha.cars.*)")
	public void withInPointcut() {
	}

	@Before("withInPointcut()")
	public void withInAdvice() {
		System.out.println("withIn Advice giving restriction using @Component");
	}


}
