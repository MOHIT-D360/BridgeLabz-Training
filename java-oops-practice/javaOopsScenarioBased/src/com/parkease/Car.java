package com.parkease;

class Car extends Vehicle {

    Car(String number) {
        super(number, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 5)
            charge += 100;   
        return charge;
    }
}
