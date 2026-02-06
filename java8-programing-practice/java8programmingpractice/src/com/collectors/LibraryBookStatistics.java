package com.collectors;
import java.util.*;
import java.util.stream.*;

class Book{
	String name;
	String genre;
	int pages;
	Book(String name,String genre,int pages){
		this.name = name;
		this.genre = genre;
		this.pages = pages;
		
	}
	
}
public class LibraryBookStatistics {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		list.add(new Book("book1","genre 1",340));
		list.add(new Book("book2","genre 2",540));
		list.add(new Book("book3","genre 1",640));
		list.add(new Book("book4","genre 3",140));
		list.add(new Book("book5","genre 1",200));
		list.add(new Book("book6","genre 3",780));
		
		Map<String, IntSummaryStatistics > hm = list.stream()
				.collect(Collectors.groupingBy(x->x.genre,
					Collectors.summarizingInt(x->x.pages)
						));
		
		hm.forEach((genre,value)->{
			System.out.println("Genre :"+ genre);
			System.out.println("Total pages :"+ value.getSum());
			System.out.println("Average pages :"+ value.getAverage());
			System.out.println("Maximum pages :"+ value.getMax());
		});
	}
}
