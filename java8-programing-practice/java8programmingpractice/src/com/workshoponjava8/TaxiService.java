package com.workshoponjava8;

public class TaxiService implements TransportService {
    public String getServiceName() { return "Taxi"; }
    public double getFare() { return 100; }
}