package com.cinemahouse;

public class CinemaHouseApp {
 public static void main(String [] args) {
	 Movie[] m = new Movie[5];
	 
	 m[0] = new Movie("Krish 3",4);
	 m[1] = new Movie("dhamal",3);
	 m[2] = new Movie("Animal",5);
	 m[3] = new Movie("Avengers",1);
	 m[4] = new Movie("Avatar",2);
	 
	 Sort.bubbleSort(m);
	 
	 for(int i=0;i<m.length;i++) {
		 m[i].display();
		 System.out.println("-----------------");
	 }
	 
 }
}
