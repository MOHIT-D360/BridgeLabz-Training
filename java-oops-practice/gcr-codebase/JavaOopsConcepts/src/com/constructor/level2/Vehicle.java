package com.constructor.level2;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	
	private static double registrationFee= 4000.00;
	
	Vehicle(String ownerName,String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		
	}
	
	public void displayVehicleDetails() {
		System.out.println("Owner's Name :"+ ownerName);
		System.out.println("vehicle's Type :"+ vehicleType);
		System.out.println("Registration fee :"+ registrationFee);
		
	}
	public static void updateRegistrationFee(double fee) {
		registrationFee = fee;
	}

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Mohit ", "4-wheeler");
		v1.displayVehicleDetails();
		Vehicle.updateRegistrationFee(6993.33);
		v1.displayVehicleDetails();
		
		

	}

}
