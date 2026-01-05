package com.vehiclerentalapplication;

public class Bike extends Vehicle {
	Bike(String number,double rate){
		super(number,rate);
	}
	@Override
	public double calculateRent(int days) {
		return days*rentalRate;
	}
}
