package com.CabbyGo;

abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private double ratePerKm;

    Vehicle(String vehicleNumber, int capacity, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
