package com.hospitalmanagementsystem;

public class OutPatient extends Patient{
	private double consultationFee;
	
	OutPatient(int id,String name,int age,double fee){
		super(id,name,age);
		this.consultationFee = fee;
		
	}
	double calculateBill() {
		return consultationFee;
	}
	void displayInfo() {
		System.out.printf("In-patient    :");
		getSummary();
	}
}
