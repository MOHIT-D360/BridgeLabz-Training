package com.lambdaexpressions.smarthomelightingautomation;

public class SmartHomeApp {
	public static void main(String[] args) {
		SmartLightController controller  = new SmartLightController();
		
		Switchable motionTrigger = ()-> System.out.println("Motion detected light ON");
		
		
		Switchable timeTrigger =()-> System.out.println("Night time light on");
		
		Switchable voiceTrigger = ()->System.out.println("voice command: lights on");
		
		controller.runTrigger(motionTrigger);
		controller.runTrigger(timeTrigger);
		controller.runTrigger(voiceTrigger);
	}
}
