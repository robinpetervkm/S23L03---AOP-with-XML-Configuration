package com.norha.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.norha.config.Config;
import com.norha.service.Cars;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		Cars car = context.getBean("cars",Cars.class);
		/* car.getPertolCar().run("Robin"); */
		
		car.getPertolCar().stop("STOP"); 
		
		context.close();
	}
}
 