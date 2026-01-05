package com.smarthomeautomationsystem;

class AC extends Appliance {

    AC(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC Cooling Started (Power: " + getPowerUsage() + "W)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC OFF");
    }
    public String getName() {
        return "Ac";
    }
}
