package com.norha.service;

import com.norha.cars.ElectricCar;

public class Cars {
	private ElectricCar electricCar = new ElectricCar();
	private PertolCar pertolCar = new PertolCar();
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
