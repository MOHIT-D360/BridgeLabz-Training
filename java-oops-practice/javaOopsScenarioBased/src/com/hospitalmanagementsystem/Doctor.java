package com.hospitalmanagementsystem;

public class Doctor {
	private int doctorId ;
	private String doctorName;
	private String specialization;
	
	
	Doctor(int doctorId,String doctorName,String specialization){
		this.doctorId= doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		
	}
	void displayInfo() {
		System.out.println("Doctor Name       :"+ doctorName);
		System.out.println("Specialization    :"+ specialization);
		
	}
	
}
