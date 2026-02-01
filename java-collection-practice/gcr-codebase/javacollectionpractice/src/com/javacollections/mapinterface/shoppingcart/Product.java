package com.javacollections.mapinterface.shoppingcart;

public class Product implements Comparable<Product>{
	String name;
	double price;
	
	Product(String name,double price){
		this.name = name;
		this.price = price;
	}
	double getPrice() {
		return price;
	}
	public String toString() {
		return name;
	}
	
	public int compareTo(Product other) {
		return Double.compare(other.price, this.price);
	}
}
