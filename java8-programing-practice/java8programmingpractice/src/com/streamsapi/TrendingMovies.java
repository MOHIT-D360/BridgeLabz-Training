package com.streamsapi;
import java.util.*;
import java.util.stream.*;

	class Movie{
		double rating ;
		String name;
		int releaseYear;
		
		Movie(double rating , String name,int releaseYear){
			this.rating = rating ;
			this.name = name;
			this.releaseYear = releaseYear;
			
		}
		
		public String toString() {
			return name;
		}
		
	}
public class TrendingMovies {
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(4.5,"movie 1",2024));
		list.add(new Movie(4.3,"movie 2",2020));
		list.add(new Movie(4.4,"movie 3",2021));
		list.add(new Movie(4.1,"movie 4",2022));
		list.add(new Movie(4.7,"movie 5",2023));
		
		System.out.println("----------By Rating ------------");
		 list.stream()
				 
				 .sorted((m1,m2)->Double.compare(m2.rating, m1.rating))
				 .limit(5)
				 .forEach(System.out::println);
		
		 System.out.println("-------------By release by---------");
		 list.stream()
		 .sorted((m1,m2)->Double.compare(m1.releaseYear, m2.releaseYear))
		 .limit(5)
		 .forEach(System.out::println);
		 
	}
}
