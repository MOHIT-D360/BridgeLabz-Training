package com.parkease;

class ParkingManager {

    private ParkingSlot[] slots;
    private int recordCount;

    ParkingManager() {
        slots = new ParkingSlot[5];
        slots[0] = new ParkingSlot(1, "Car");
        slots[1] = new ParkingSlot(2, "Bike");
        slots[2] = new ParkingSlot(3, "Car");
        slots[3] = new ParkingSlot(4, "Truck");
        slots[4] = new ParkingSlot(5, "Bike");
        recordCount = 0;
    }

    public ParkingSlot assignSlot(Vehicle vehicle) {

        for (int i = 0; i < slots.length; i++) {
            if (slots[i].isFree() &&
                slots[i].getVehicleTypeAllowed()
                        .equals(vehicle.getVehicleType())) {

                slots[i].occupy();
                System.out.println("Slot " + slots[i].getSlotId() +
                        " assigned to " + vehicle.getVehicleType());
                return slots[i];
            }
        }

        System.out.println(" No slot available for " +
                vehicle.getVehicleType());
        return null;
    }

    public void releaseSlot(ParkingSlot slot) {
        slot.free();
        System.out.println("Slot " + slot.getSlotId() + " is now free");
    }
}
