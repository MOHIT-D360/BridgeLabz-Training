package com.parkease;

class Bike extends Vehicle {

    Bike(String number) {
        super(number, 30);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 6)
            charge += 50;
        return charge;
    }
}
