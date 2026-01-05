package com.CabbyGo;

public class RideService implements IRideService{
	private boolean rideActive = false;
	private double fare;
	
	private static final double BASE_FARE = 50;
	
	public void bookRide(Driver d, Vehicle v , double distance) {
		if(rideActive) {
			System.out.println("Already booked");
			return;
		}
		
		fare= BASE_FARE + (distance*v.getRatePerKm());
		rideActive = true;
		
		
		 System.out.println(" Ride Booked");
	        System.out.println("Driver : " + d.getName() + " ( " + d.getRating() + ")");
	        System.out.println("Vehicle: " + v.getType() +
	                           " [" + v.getVehicleNumber() + "]");
	        System.out.println("Distance: " + distance + " km");
	        System.out.println("Fare    : " + fare);
	}
	
	public void endRide() {
		if(!rideActive) {
			System.out.println("No active ride");
			return;
		}
		System.out.println("Ride ended");
		System.out.println("Final Fare : "+fare);
		
		rideActive = false;
		fare= 0;
	}
}
