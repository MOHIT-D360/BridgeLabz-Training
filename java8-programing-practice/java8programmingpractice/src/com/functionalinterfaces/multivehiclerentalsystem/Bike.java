package com.functionalinterfaces.multivehiclerentalsystem;

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike is rented");
    }

    public void returnVehicle() {
        System.out.println("Bike is returned");
    }
}
