package com.lambdaexpressions.customsortinginecommerce;

public class Shop {
	
	double price;
	double rating;
	String name;
	double discount;
	
	Shop(double price,double rating ,String name,double discount){
		this.price = price;
		this.rating = rating ;
		this.name = name;
		this.discount = discount;
		
	}
	public String toString() {
		return name + " Price :"+price + " Rating :"+rating + " Discount :"+ discount;
	}
}
