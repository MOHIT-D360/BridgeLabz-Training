package com.vehiclerentalapplication;

public class Customer {
	private String name;
	Customer(String name){
		this.name = name;
	}
	
	public void rentVehicle(Vehicle v,int days) {
        System.out.println("Customer: " + name);
        System.out.println("Vehicle No: " + v.getVehicleNumber());
        System.out.println("Total Rent: " + v.calculateRent(days));
        System.out.println("----------------------");

	}
}
