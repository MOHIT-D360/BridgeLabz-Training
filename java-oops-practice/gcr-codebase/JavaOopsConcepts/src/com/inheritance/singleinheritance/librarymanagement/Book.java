package com.inheritance.singleinheritance.librarymanagement;

public class Book {
	protected String title;
	protected int publicationYear;
	Book(String title,int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	void displayInfo() {
		System.out.println("Title             :"+title);
		System.out.println("Publication Year  :"+publicationYear);
	}
}
