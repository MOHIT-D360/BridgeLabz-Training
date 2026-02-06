package com.functionalinterfaces.multivehiclerentalsystem;

public class Car implements Vehicle{
	public void rent() {
		System.out.println("Car is rented ");
	}
	 public void returnVehicle() {
	        System.out.println("Car is returned");
	    }
}
