package com.workshoponjava8;

public class AmbulanceService implements TransportService,EmergencyService{
	public String getServiceName() {return "Ambulance";}
	
	public double getFare() { return 0;}
	
}
