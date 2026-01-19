package com.bookshelf;
import java.util.*;

public class BookShelf {
	HashMap<String,LinkedList<Book>> genreMap = new 
			HashMap<>();
	
	void addBook(String genre,Book book) {
		if(!genreMap.containsKey(genre)) {
			
	  	genreMap.put(genre, new LinkedList<>());
		}
		genreMap.get(genre).add(book);
		
	}
	void borrowBook(String genre,String isbn) {
		LinkedList<Book> list = genreMap.get(genre);
		if(list == null) return;
		
		for(int i=0;i<list.size();i++) {
			Book b = list.get(i);
			
			if(b.isbn.equals(isbn)) {
				list.remove(i);
				break;
			}
		}
		System.out.println("Book borrowed successfully");
	}
	
	void showBooks() {
		for(String genre: genreMap.keySet()) {
			System.out.println("Genre: " + genre);
			
			LinkedList<Book> list = genreMap.get(genre);
			
			for(int i=0;i<list.size();i++) {
				Book b = list.get(i);
				System.out.println(b.title + " - "+ b.author);
			}
		}
	}
}
