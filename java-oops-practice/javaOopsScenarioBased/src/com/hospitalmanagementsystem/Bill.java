package com.hospitalmanagementsystem;

public class Bill implements Payable{
	private double amount;
	private double taxRate = 5;
	private double discount  = 10;
	
	Bill(double amount){
		this.amount = amount;
	}
	
	public double calculatePayment() {
		double tax  = (amount*taxRate)/100;
		return amount + tax - discount;
	}
}
