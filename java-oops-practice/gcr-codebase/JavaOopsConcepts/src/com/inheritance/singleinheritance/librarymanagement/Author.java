package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
	private String name;
	private String bio;
	
	Author(String title,int publicationYear,String name,String bio){
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
		
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Author name             :"+title);
		System.out.println("Bio                     :"+publicationYear);
	}
}
