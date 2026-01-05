package com.hospitalmanagementsystem;

public class InPatient extends Patient{
	private int dayAdmitted;
	private double dailyCharge;
	
	InPatient(int id ,String name,int age,int days,double charge){
		super(id,name,age);
		this.dayAdmitted = days;
		this.dailyCharge = charge;
	}
	double calculateBill() {
		return dayAdmitted*dailyCharge;
		
	}
	public void displayInfo() {
		System.out.printf("In-patient    :");
		getSummary();
	}
}
