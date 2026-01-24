package com.FoodLoop;

public class FoodItem {
	protected String name ;
	protected String category;
	protected double price;
	boolean availability;
	
	FoodItem(String name,double price){
		this.name = name;
		this.price = price;
		this.availability = true;
		setCategory();
		
	}
	public double getPrice() {
		return price;
	}
	private void setCategory() {
		this.category = this.getClass().getSimpleName();
	}
	
	
	public void getDetails() {
		System.out.println("Name    :"+name);
		System.out.println("Category:"+category);
		System.out.println("price    :"+price);
		if(availability) {
			
			System.out.println("Item is Available");
		}
		else {
			System.out.println("Item is Unavailable");
		}
		
	}
	
	
}
