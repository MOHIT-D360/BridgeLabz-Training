package com.swiftcar;

public class SwiftCarApp {
	
	public static void main(String [] args) {
		Product p1 = new Product("colgate",82.0,"daily-use");
		Product p2 = new Product("Hair oil",135.2,"daily-use");
		
		Product p3 = new PerishableProduct("potato",40.9,"veg",6);
		
		Cart c1 = new Cart();
		
		c1.addProduct(p1);
		c1.addProduct(p2);
		c1.addProduct(p3);
		
	
		c1.displayItem();
		System.out.println("__________________________");
		
		c1.generateBill();
		c1.applyDiscount();
		
		
	}
	
	
}
