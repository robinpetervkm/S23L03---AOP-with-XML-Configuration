package com.norha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.norha.cars.ElectricCar;
import com.norha.diagnosis.Diagnosis;
import com.norha.service.Cars;
import com.norha.service.PertolCar;

@Configuration
@EnableAspectJAutoProxy
public class Config {
	
	@Bean("electricCar")
	ElectricCar electricCar() {
		return new ElectricCar();
	}
	
	@Bean("petrolCar")
	PertolCar petrolCar() {
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
