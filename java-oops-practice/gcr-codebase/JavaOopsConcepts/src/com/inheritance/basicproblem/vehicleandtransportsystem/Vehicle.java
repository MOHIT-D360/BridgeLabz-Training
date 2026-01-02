package com.inheritance.basicproblem.vehicleandtransportsystem;

public class Vehicle {
	protected int maxSpeed;
	protected String fuelType;
	
	Vehicle(int maxSpeed,String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
		
	}
	void displayInfo(){
		System.out.println("max speed      :"+maxSpeed);
		System.out.println("fuel type      :"+fuelType);
		
	}
}
