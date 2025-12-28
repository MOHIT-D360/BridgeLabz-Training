package com.constructor.level1;

public class Book {
	private String title ;
	private String author;
	private double price;
	
	// default constructor
	Book(){
		title = "Wings of fire";
		author = "Abj abdul kalam";
		price = 550.0;
	}
	//parameterized constructor
	Book(String title ,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void showData() {
		System.out.println("Title of book :"+ title);
		System.out.println("Author of book :"+ author);
		System.out.println("Price of book :"+ price);
	}
	

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("Sapiens","Yuval Noah Harari",350.99);
		b1.showData();
		b2.showData();
		
		
	}

}
