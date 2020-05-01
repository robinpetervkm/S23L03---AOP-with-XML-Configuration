package com.norha.cars;



public class ElectricCar {

	public void run(){
		System.out.println("Running Electric Car");
	}
	public String stop(String msg) {
		System.out.println("Message : "+msg);
		return msg;
	}
}
