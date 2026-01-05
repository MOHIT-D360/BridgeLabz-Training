package com.smarthomeautomationsystem;

abstract class Appliance implements Controllable {
    private boolean isOn;
    private int powerUsage;
    protected String name;

    // Default power
    Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }
    
    
    String getName() {
    	return this.getClass().getSimpleName();
    }

    protected int getPowerUsage() {
        return powerUsage;
    }

    protected void setOn(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }
}

	

