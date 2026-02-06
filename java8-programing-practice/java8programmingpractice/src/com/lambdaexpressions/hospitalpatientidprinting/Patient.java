package com.lambdaexpressions.hospitalpatientidprinting;

public class Patient {
	int patientId;
	
	String name ;
	
	Patient(int patientId,String name){
		this.patientId = patientId;
		this.name= name;
		
	}
	public String toString() {
		return "Patient Id : "+patientId + " Name :"+ name;
	}
	
}
