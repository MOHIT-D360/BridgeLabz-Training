package com.inheritance.basicproblem.vehicleandtransportsystem;

class Motorcycle extends Vehicle {
    private boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear      : " + hasGear);
        System.out.println("Vehicle Type  : Motorcycle");
        
    }
}
