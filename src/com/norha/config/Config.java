package com.norha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.norha.cars.ElectricCar;
import com.norha.service.Cars;
import com.norha.service.PertolCar;

@Configuration
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
}
