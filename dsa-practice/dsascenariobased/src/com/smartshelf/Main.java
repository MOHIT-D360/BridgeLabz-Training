package com.smartshelf;

public class Main {
	public static void main(String [] args) {
		 Book[] shelf = new Book[5];
	        int count = 0;

	        shelf[count++] = new Book("title 1","author 1",322);
	        SmartShelf.insertionSort(shelf, count);

	        shelf[count++] = new Book("title 4","author 4",322);
	        SmartShelf.insertionSort(shelf, count);

	        shelf[count++] = new Book("title 2","author 2",322);
	        SmartShelf.insertionSort(shelf, count);

	        shelf[count++] = new Book("title 3","author 3",322);
	        SmartShelf.insertionSort(shelf, count);
	        
	        for(int i=0;i<count;i++) {
	        	shelf[i].showBook();
	        	
	        	System.out.println("-----------------");
	        }

	}
}
