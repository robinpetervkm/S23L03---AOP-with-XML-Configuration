package com.norha.cars;


import com.norha.objects.Battery;

public class ElectricCar {
	@Deprecated
	public void run() {
		System.out.println("Running Electric Car");
	}

	public String stop(String msg) {
		System.out.println("Message : " + msg);
		return msg;
	}

	public void recharge(Battery battery) {
		System.out.println("Battery GOT Recharged");
	}
}
