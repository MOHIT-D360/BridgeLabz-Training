package com.vehiclerentalapplication;

class Car extends Vehicle {

    Car(String number, double rate) {
        super(number, rate);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 200;   
        return (rentalRate * days) + surcharge;
    }
}

