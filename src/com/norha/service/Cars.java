package com.norha.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.norha.cars.ElectricCar;
import com.norha.cars.PertolCar;

public class Cars {
	
	@Autowired
	private ElectricCar electricCar;
	
	@Autowired
	private PertolCar pertolCar;
	
	public ElectricCar getElectricCar() {
		return electricCar;
	}
	public void setElectricCar(ElectricCar electricCar) {
		this.electricCar = electricCar;
	}
	public PertolCar getPertolCar() {
		return pertolCar;
	}
	public void setPertolCar(PertolCar pertolCar) {
		this.pertolCar = pertolCar;
	}

}
