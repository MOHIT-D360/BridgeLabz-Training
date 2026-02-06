package com.functionalinterfaces.smartdevicecontrolinterface;

public class Ac implements Switchable{
	String name;
	Ac(String name){
		this.name = name;
		
	}
	@Override
	public void turnOn() {
		System.out.println(name + "Ac turned on ");
	}
	
	public void turnOff() {
		System.out.println(name + "Ac turned off");
	}
}
