package com.constructor.level2;

public class Book {
	public int ISBN;
	protected String title ;
	private String author;
	
	Book(int ISBN,String title , String author){
		this.ISBN = ISBN;
		this.title = title;
		this.author= author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public void displayBook() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("title       : " + title);
        System.out.println("author       : " + author);
    }
	
}
