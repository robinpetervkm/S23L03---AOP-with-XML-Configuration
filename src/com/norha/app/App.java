package com.norha.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.norha.cars.PertolCar;
import com.norha.config.Config;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		PertolCar pertolCar = context.getBean("petrolCar",PertolCar.class);// here this proxy object is crated of type Machine Interface
		
		pertolCar.run(); 
		
		context.close();
	}
}
 