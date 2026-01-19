package com.cinemahouse;

public class Movie {
	String movieName ;
	int noOfShows;
	Movie(String movieName,int noOfShows){
		this.movieName  = movieName;
		this.noOfShows = noOfShows;
		
	}
	
	void display() {
		System.out.println("Movie Name   :"+movieName);
		System.out.println("No. of Shows :"+noOfShows);
	}
}
