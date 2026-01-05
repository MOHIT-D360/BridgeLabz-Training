package com.vehiclerentalapplication;

public abstract class Vehicle implements Rentable {
	private String vehicleNumber;
	protected double rentalRate;
	
	Vehicle(String vehicleNumber,double rentalRate){
		this.vehicleNumber = vehicleNumber;
		this.rentalRate = rentalRate;
		
	}
	 
	public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return rentalRate;
    }
	
}
