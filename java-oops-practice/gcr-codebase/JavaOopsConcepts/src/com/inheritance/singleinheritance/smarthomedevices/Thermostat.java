package com.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device {
	private String temperatureSetting ;
	
		Thermostat(int deviceId,String status,String temperatureSetting){
			super(deviceId,status);
			this.temperatureSetting= temperatureSetting;
			
		}
		
		void displayStatus(){
			super.displayStatus();
			System.out.println("temperature setting       :" + temperatureSetting);
		}
	
	public static void main(String[] args) {
		Thermostat t1 = new Thermostat(22124,"ready to measure","celsius");
		Device d1 = new Device(22224,"Device is ready");
		
		t1.displayStatus();
		d1.displayStatus();
		

	}

}
