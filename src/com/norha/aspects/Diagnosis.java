package com.norha.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	/* @Pointcut("execution(void com.norha.cars.PertolCar.run())") */

	/* @Pointcut("execution(void com.norha.cars.PertolCar.run(*))") */

	/* @Pointcut("execution(void com.norha.cars.PertolCar.run(*,*))") */

	/* @Pointcut("execution( * com.norha.cars.PertolCar.run(..))") */
	
	/* @Pointcut("execution( * com.norha.cars.*.run(..))") */
	
	 @Pointcut("execution( * com.norha.cars.*.*(..))") 
	public void run() {
	}

	@Before("run()")
	public void testAdvice() {
		System.out.println("Test Advice");
	}

}
