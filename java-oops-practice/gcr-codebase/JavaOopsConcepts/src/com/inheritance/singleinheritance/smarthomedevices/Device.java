package com.inheritance.singleinheritance.smarthomedevices;

public class Device {
	protected int deviceId ;
	protected String status;
	
	Device(int deviceId,String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	
	void displayStatus() {
		System.out.println("device id      :" + deviceId);
		System.out.println("Status         :" + status);
	}
}
