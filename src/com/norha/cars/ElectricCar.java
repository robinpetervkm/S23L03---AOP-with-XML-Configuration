package com.norha.cars;

import org.springframework.stereotype.Component;

import com.norha.objects.Battery;

@Component
public class ElectricCar {

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
