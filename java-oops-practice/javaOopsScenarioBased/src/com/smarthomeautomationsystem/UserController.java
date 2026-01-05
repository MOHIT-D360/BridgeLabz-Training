package com.smarthomeautomationsystem;

public class UserController {
	void controller(Controllable device,boolean turnOn) {
		if(turnOn)
			device.turnOn();
		else
			device.turnOff();
	}
		
		public void compareEnergy(Appliance a1,Appliance a2) {
			if(a1.getPowerUsage()>a2.getPowerUsage()) {
				System.out.println(a1.getName() + " use more power");
			
		}
			else {
				System.out.println(a1.getName() + " use more power");
			}
	}
}
