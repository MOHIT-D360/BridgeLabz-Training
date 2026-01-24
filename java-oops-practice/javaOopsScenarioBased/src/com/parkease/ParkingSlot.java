package com.parkease;

public class ParkingSlot {
	private int slotId ;
	private boolean isOccupied;
	private String vehicleTypeAllowed;
	private int slotSpace ;
	
	ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }
	 public int getSlotId() {
	        return slotId;
	    }

	    public boolean isFree() {
	        return !isOccupied;
	    }

	    public String getVehicleTypeAllowed() {
	        return vehicleTypeAllowed;
	    }
	    
	    void occupy() {
	        isOccupied = true;
	    }

	    void free() {
	        isOccupied = false;
	    }
}
