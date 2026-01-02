package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class VehicleTest {
	public static void main(String[] args) {
		ElectricVehicle v1 = new ElectricVehicle(240,"x1 bmw");
		Refuelable v2 = new PetrolVehicle(300,"m5 bmw");
		
		
		v1.charge();
		v2.refuel();
		
	}
}
