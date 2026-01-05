package com.smarthomeautomationsystem;

public class Fan extends Appliance{
	Fan(int power){
		super(power);
	}
	public void turnOn() {
		setOn(true);
		System.out.println("Fan On ");
	}
	public void turnOff() {
		setOn(false);
		System.out.println("Fan OFF");
	}
	 public String getName() {
	        return "Fan";
	    }
	
}

