package com.linkedlist.doublylinkedlist.librarymanagemnetsystem;

public class BookNode {
	
	    String title;
	    String author;
	    String genre;
	    int bookId;
	    boolean isAvailable;
	    BookNode next;
	    BookNode prev;
	    //constructor
	    public BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.genre = genre;
	        this.isAvailable = isAvailable;
	        this.next = null;
	        this.prev = null;
	    }
}
