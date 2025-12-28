package com.constructor.level2;

public class EBook extends Book {
	private int monthOfSubscribtion;
	
	
	EBook(int ISBN,String title , String author,int monthOfSubscribtion){
		super(ISBN,title,author);
		this.monthOfSubscribtion = monthOfSubscribtion;
		
	}
	public void setTitle(String title) {
		super.title = title;
	}
	public void setISBN(int ISBN ) {
		super.ISBN = ISBN;
	}
	
	public void displayEBook() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("title       : " + title);
        System.out.println("month of subscribtion :"+ monthOfSubscribtion);
	}

	public static void main(String[] args) {
		EBook b1 = new EBook(9981,"Wings of fire", "ABJ abdul kalam", 5);
		b1.displayEBook();
		b1.setTitle("Sapiens");
		b1.setISBN(1123);
		b1.displayBook();
	

	}

}
