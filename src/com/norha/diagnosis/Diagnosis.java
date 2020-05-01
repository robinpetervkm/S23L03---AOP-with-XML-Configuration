package com.norha.diagnosis;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Diagnosis {
	@Before("execution(void run())")
	public void engin() {
		System.out.println("Checking Engin");
	}

}
