package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle  extends Vehicle {
	ElectricVehicle(int maxSpeed , String model){
		super(maxSpeed,model);
		
	}
	public void charge() {
		System.out.println("Car is charging");
	}
}
