package com.norha.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.norha.cars.ElectricCar;
import com.norha.cars.Machine;

public class Cars {
	
	@Autowired
	private ElectricCar electricCar;
	
	@Autowired
	private Machine pertolCar;
	
	public ElectricCar getElectricCar() {
		return electricCar;
	}
	public void setElectricCar(ElectricCar electricCar) {
		this.electricCar = electricCar;
	}
	public Machine getPertolCar() {
		return pertolCar;
	}
	public void setPertolCar(Machine pertolCar) {
		this.pertolCar = pertolCar;
	}

}
