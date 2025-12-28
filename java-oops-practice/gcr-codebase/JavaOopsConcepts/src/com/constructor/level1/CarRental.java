package com.constructor.level1;

public class CarRental {
	private String customerName;
	private String carModel ;
	private int rentalDays;
	
	CarRental(String customerName,String carModel,int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		
		calculateTotal();
		
	}
	private double totalCost =0;
	private void calculateTotal() {
		double costPerDay = 5000;
		totalCost = costPerDay*rentalDays;
		
		
		
	}
	
	public void display() {
		System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + totalCost);
	}
	

	public static void main(String[] args) {
		CarRental c1 = new CarRental("Mohit", "BMW",4);
		c1.display();

	}

}
