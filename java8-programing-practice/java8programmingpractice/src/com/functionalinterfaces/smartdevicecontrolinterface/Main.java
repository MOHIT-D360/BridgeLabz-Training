package com.functionalinterfaces.smartdevicecontrolinterface;

public class Main {
	public static void main(String[] args) {
		Lights l = new Lights("surya");
		Ac a = new Ac("phanasonic");
		Tv t = new Tv("Samsung");
		
		System.out.println("-------Turning on ------------");
		l.turnOn();
		a.turnOn();
		t.turnOn();
		
		System.out.println();
		System.out.println("--------Turing off ------------");
		l.turnOff();
		a.turnOff();
		t.turnOff();
		
		
	}
}
