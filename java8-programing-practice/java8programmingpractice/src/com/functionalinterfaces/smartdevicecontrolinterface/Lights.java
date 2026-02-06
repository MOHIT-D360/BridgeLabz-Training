package com.functionalinterfaces.smartdevicecontrolinterface;

public class Lights implements Switchable{
	String name;
	Lights(String name){
		this.name = name;
		
	}
	@Override
	public void turnOn() {
		System.out.println(name + " turned on");
	}
	
	public void turnOff() {
		System.out.println(name + " turned off");
	}
}
