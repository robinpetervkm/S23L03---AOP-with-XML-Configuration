package com.norha.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	/*
	 * @Before("execution(void com.norha.cars.PertolCar.run())") public void
	 * pertolEnginBefore() { System.out.println("Checking Pertol Engin"); }
	 * 
	 * @After("execution(void com.norha.cars.PerolCar.run())") public void
	 * pertolEnginAfter() { System.out.println("Montering Pertol Engin"); }
	 */

	@Pointcut("execution(void com.norha.cars.ElectricCar.run())")
	public void run() {}
	
	@Before("run()")
	public void electricEnginBefore() {
		System.out.println("Checking Electric Engin");
	}

	/*
	 * @After("run()") public void electricEnginAfter() {
	 * System.out.println("Montering Electric Engin"); }
	 */
	
	@AfterReturning("run()")
	public void electricEnginAfter() {
		System.out.println("Montering Electric Engin");
	}
	
	
	
	

}
