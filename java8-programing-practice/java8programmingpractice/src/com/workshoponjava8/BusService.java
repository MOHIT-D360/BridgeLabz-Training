package com.workshoponjava8;

public class BusService implements TransportService{
	public String getServiceName() {
		return "Bus";
		
		
	}
	public double getFare() {
		return 20;
	}
	
}
