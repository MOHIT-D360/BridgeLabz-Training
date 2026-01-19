package com.bookshelf;

public class Main {
	  public static void main(String[] args) {

	        BookShelf shelf = new BookShelf();

	        Book b1 = new Book("Clean Code", "Robert C. Martin", "ISBN101");
	        Book b2 = new Book("Effective Java", "Joshua Bloch", "ISBN102");
	        Book b3 = new Book("Java Complete Reference", "Herbert Schildt", "ISBN103");
	        
	        Book b4 = new Book("title 1", "author 1", "ISBN104");
	        Book b5 = new Book("title 2", "author 2", "ISBN105");
	        Book b6 = new Book("title 3", "author 2", "ISBN106");


	        shelf.addBook("Programming", b1);
	        shelf.addBook("Programming", b2);
	        shelf.addBook("Programming", b3);
	        shelf.addBook("genre", b4);
	        shelf.addBook("genre", b5);
	        shelf.addBook("genre", b6);


	        shelf.borrowBook("Programming", "ISBN102");

	        shelf.showBooks();
	    }
}
