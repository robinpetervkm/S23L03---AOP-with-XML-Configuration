package com.norha.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.norha.cars.Machine;
import com.norha.config.Config;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		Machine machine = context.getBean("petrolCar",Machine.class);// here this proxy object is crated of type Machine Interface
		
		machine.run(); 
		
		context.close();
	}
}
 