package com.hospitalmanagementsystem;

public class Hospital {
	
	public static void main(String [] args) {
	Patient p1 = new InPatient(101,"Mohit",21,5,675.00);
	Patient p2 = new OutPatient(102,"Rahul",25,500);
	
	Doctor d1 = new Doctor(121,"Dr. Sharma", "Cardiology");
	
	p1.displayInfo();
	p2.displayInfo();
	d1.displayInfo();
	
	Bill b1 = new Bill (((InPatient)p1).calculateBill());
	Bill b2 = new Bill (((OutPatient)p2).calculateBill());
	
	System.out.println("In-Patient Final Bill : "+ b1.calculatePayment());
	System.out.println("Out-Patient Final Bill:"+ b2.calculatePayment());
	
	
	}
	
}
