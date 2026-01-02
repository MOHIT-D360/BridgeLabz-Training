package com.inheritance.singleinheritance.librarymanagement;

public class TestBookAuthor {
	public static void main(String [] args) {
		 
		Book[] books = new Book[2];
		books[0] = new Book("wings of fire",1990);
		books[1] = new Author("wings of fire",1990,"Abj abdul kalam", "The OG missile man and one of the great president of india");
		
		for(Book b : books) {
			b.displayInfo();
		}
	}
}
