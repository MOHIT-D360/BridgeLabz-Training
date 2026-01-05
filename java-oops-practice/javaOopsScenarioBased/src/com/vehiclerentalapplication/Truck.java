package com.vehiclerentalapplication;

class Truck extends Vehicle {

    Truck(String number, double rate) {
        super(number, rate);
    }

    @Override
    public double calculateRent(int days) {
        double heavyLoadCharge = rentalRate * days * 0.2;
        return (rentalRate * days) + heavyLoadCharge;
    }
}
