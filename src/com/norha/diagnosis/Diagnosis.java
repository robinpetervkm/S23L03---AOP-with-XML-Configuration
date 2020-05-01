package com.norha.diagnosis;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Diagnosis {

	/*
	 * @Before("execution(void com.norha.cars.PertolCar.run())") public void
	 * pertolEnginBefore() { System.out.println("Checking Pertol Engin"); }
	 * 
	 * @After("execution(void com.norha.cars.PerolCar.run())") public void
	 * pertolEnginAfter() { System.out.println("Montering Pertol Engin"); }
	 */
	@Before("execution(void com.norha.cars.ElectricCar.run())")
	public void electricEnginBefore() {
		System.out.println("Checking Electric Engin");
	}

	@After("execution(void com.norha.cars.ElectricCar.run())")
	public void electricEnginAfter() {
		System.out.println("Montering Electric Engin");
	}

}
