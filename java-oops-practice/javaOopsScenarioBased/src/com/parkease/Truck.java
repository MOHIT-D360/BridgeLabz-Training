package com.parkease;

class Truck extends Vehicle {

    Truck(String number) {
        super(number, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 4)
            charge += 200;
        return charge;
    }
}
