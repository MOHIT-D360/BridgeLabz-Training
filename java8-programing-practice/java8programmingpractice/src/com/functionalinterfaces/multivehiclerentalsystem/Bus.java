package com.functionalinterfaces.multivehiclerentalsystem;

class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus is rented");
    }

    public void returnVehicle() {
        System.out.println("Bus is returned");
    }
}
