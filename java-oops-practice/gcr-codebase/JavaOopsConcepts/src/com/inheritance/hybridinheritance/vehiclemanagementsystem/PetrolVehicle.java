package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
	PetrolVehicle(int maxSpeed,String mode){
		super(maxSpeed,mode);
	}
	@Override
	public void refuel() {
		System.out.println("Car successfully refuled");
	}
	
}
