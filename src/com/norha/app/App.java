package com.norha.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.norha.cars.Machine;
import com.norha.cars.PertolCar;
import com.norha.config.Config;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		Machine machine = context.getBean("petrolCar",Machine.class);
		
		machine.run(); 
		
		context.close();
	}
}
 