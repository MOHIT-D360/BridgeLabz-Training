package com.parkease;

public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingManager manager = new ParkingManager();

        Vehicle v1 = new Car("MP09-1234");
        Vehicle v2 = new Bike("MP09-5678");
        Vehicle v3 = new Truck("MP09-9999");

        ParkingSlot s1 = manager.assignSlot(v1);
        ParkingSlot s2 = manager.assignSlot(v2);
        ParkingSlot s3 = manager.assignSlot(v3);

        System.out.println("--- Charges ---");

        System.out.println("Car Charge: " + v1.calculateCharges(6));
        System.out.println("Bike Charge: " + v2.calculateCharges(7));
        System.out.println("Truck Charge: " + v3.calculateCharges(5));

        System.out.println("--- Releasing Slots ---");
        manager.releaseSlot(s1);
        manager.releaseSlot(s2);
        manager.releaseSlot(s3);
    }
}
