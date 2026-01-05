package com.vehiclerentalapplication;

public class VehicleRentalApp {
	public static void main(String [] args) {
		Vehicle bike = new Bike("Bike101",160);
		Vehicle car = new Car("Car202",1000);
		Vehicle truck = new Truck("Truck303",10000);
		
		Customer c1 = new Customer("Mohit");
		
		c1.rentVehicle(bike, 3);
		c1.rentVehicle(car, 3);
		c1.rentVehicle(truck, 3);
		
	}
}
