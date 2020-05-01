package com.norha.cars;

public class PertolCar {

	public void run() {
		System.out.println("Pertol car Running");
	}
	
	public void run(int speed) {
		System.out.println("Pertol car with speed "+speed+" KMPH");
		
	}
	public void run(int speed,int kms) {
		System.out.println("Pertol car with speed "+speed+ " KMPH"+" and "+kms+" Milage");
		
	}
	
	public String run(String msg) {
		System.out.println("Message : "+msg);
		return msg;
	}
	public String stop(String msg) {
		System.out.println("Message : "+msg);
		return msg;
	}
}
