package com.workshoponjava8;

public class MetroService implements TransportService{
	public String getServiceName() {
		return "Metro";
	}
	public double getFare() {
		return 30;
	}
}
