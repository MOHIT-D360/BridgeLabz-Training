package com.constructor.level2;

public class Product {
	private String productName;
	private double price;
	
	private static int totalProduct=0;
	
	Product(String productName,double price){
		this.productName = productName;
		this.price = price;
		totalProduct++;
	}
	
	public void displayProductDetails() {
		System.out.println("Product :"+productName);
		System.out.println("Price :"+ price);
		
	}
	public static void displayTotalProducts() {
		System.out.println("Total number of products  :"+totalProduct);
	}

	public static void main(String[] args) {
		
		Product p1 = new Product("book",330.0);
		Product p2 = new Product("Toy",220.0);
		
		p1.displayProductDetails();
		Product.displayTotalProducts();

	}

}
