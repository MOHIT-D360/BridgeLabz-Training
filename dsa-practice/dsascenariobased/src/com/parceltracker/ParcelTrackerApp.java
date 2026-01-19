package com.parceltracker;

public class ParcelTrackerApp {
	
	public static void main(String [] args) {
	Parcel p1 = new Parcel("Mohit","Bhopal shakti nagar",1,99.1);
	Parcel p2 = new Parcel("Rohit","Jabalpur ranital",2,1200);
	
	Stages ll = new Stages();
	
	ll.add(p1);
	ll.makeCheckPoint("Payment getway", 1);
	ll.status();
	ll.next();
	ll.next();
	ll.status();

	
	
	}
}
