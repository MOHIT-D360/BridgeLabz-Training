package com.smarthomeautomationsystem;

public class SmartHomeApp {
	public static void main(String[] args) {
		Appliance light = new Light();
		Appliance fannn = new Fan(75);
		Appliance ac = new AC(1500);
		
		UserController controller = new UserController();
		
		controller.controller(ac, true);
		controller.controller(fannn, true);
		controller.controller(light, true);
		
		controller.compareEnergy(fannn, ac);
		
	}
}
