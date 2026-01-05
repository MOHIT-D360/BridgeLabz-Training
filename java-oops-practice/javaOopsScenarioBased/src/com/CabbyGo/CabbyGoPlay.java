package com.CabbyGo;

public class CabbyGoPlay {

	 public static void main(String[] args) {

	        Driver d1 = new Driver("Ramesh", "DL12345", 4.8);

	        Vehicle mini = new Mini("MP09AB1234");
	        Vehicle suv  = new SUV("MP09XY9999");

	        IRideService ride = new RideService();

	        ride.bookRide(d1, mini, 10);
	        ride.bookRide(d1, suv, 8);   
	        ride.endRide();
	        ride.bookRide(d1, suv, 8);   
	        ride.endRide();
	    }

}
