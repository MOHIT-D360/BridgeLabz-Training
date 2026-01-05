package com.smarthomeautomationsystem;

public class Light extends Appliance{
	Light(){
		super(10);
	}
	public void turnOn() {
		setOn(true);
		System.out.println("Light On ");
	}
	public void turnOff() {
		setOn(false);
		System.out.println("Light OFF");
	}
	 public String getName() {
	        return "light";
	    }
	
}
