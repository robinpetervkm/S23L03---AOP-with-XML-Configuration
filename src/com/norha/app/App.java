package com.norha.app;

import com.norha.diagnosis.Diagnosis;
import com.norha.service.Cars;

public class App {
	public static void main(String[] args) {
		Cars car = new Cars();
		Diagnosis diagnosis = new Diagnosis();
		diagnosis.engin();
		car.getElectricCar().run();
	}

}
