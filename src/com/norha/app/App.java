package com.norha.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.norha.cars.ElectricCar;
import com.norha.config.Config;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		ElectricCar electricCar = context.getBean("electricCar",ElectricCar.class);
		
		electricCar.run(); 
		
		context.close();
	} 
}
 