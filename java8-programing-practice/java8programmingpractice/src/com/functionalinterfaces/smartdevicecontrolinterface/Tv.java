package com.functionalinterfaces.smartdevicecontrolinterface;

public class Tv implements Switchable{
	String name;
	Tv(String name){
		this.name = name;
		
	}
	@Override
	public void turnOn() {
		System.out.println(name + " TV turned on");
	}
	
	public void turnOff() {
		System.out.println(name + " TV turned off");
	}
}
