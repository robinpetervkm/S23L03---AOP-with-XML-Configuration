package com.norha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.norha.aspects.Diagnosis;
import com.norha.cars.ElectricCar;
import com.norha.cars.Machine;
import com.norha.cars.PertolCar;
import com.norha.service.Cars;

@Configuration
@EnableAspectJAutoProxy()// here insted of this proxy object is crated of type Machine Interface
public class Config {
	
	@Bean("electricCar")
	ElectricCar electricCar() {
		return new ElectricCar();
	}
	
	@Bean("petrolCar")
	Machine petrolCar() {
		return new PertolCar();
	}
	
	@Bean("cars")
	Cars cars(){
		return new Cars();
	}
	
	@Bean("diagnosis")
	Diagnosis diagnosis() {
		return new Diagnosis();
	}
}
