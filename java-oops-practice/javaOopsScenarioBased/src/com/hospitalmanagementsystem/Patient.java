package com.hospitalmanagementsystem;

public abstract class Patient {
	protected int patientId;
	protected String name;
	protected int age;
	protected String medicalHistory;
	protected boolean Emergency;
	
	Patient(int patientId,String name,int age){
		this.patientId = patientId;
		this.name = name;
		this.age  = age;
		
	}
	
	Patient(int patientId,String name , int age , boolean Emergency){
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.Emergency = Emergency;
				
	}
	public void getSummary() {
		System.out.println("Patient Id :"+patientId);
		System.out.println("Patient Name :"+name);
		System.out.println("Patient Age :"+age);
		
	}
	abstract void displayInfo();
	
}
