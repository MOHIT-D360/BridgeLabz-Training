package com.swiftcar;

public class Product {
	protected String name;
	protected double price;
	protected String category;
	
	Product(String name,double price,String category){
		this.name = name;
		this.price = price;
		this.category = category;
	
	}
	
	public void getProductDetails() {
		System.out.println("Name      :"+ name);
		System.out.println("price     :"+price);
		System.out.println("category  :"+ category);
	}
}
