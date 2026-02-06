package com.functionalinterfaces.smartvehicledashboard;

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 70 km/h");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery: 85%");
    }
}
