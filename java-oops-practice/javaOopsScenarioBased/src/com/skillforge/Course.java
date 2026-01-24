package com.skillforge;

public class Course {
	protected String title;
	protected Instructor i;
	public  int rating ;
	protected String[] modules;
	
	Course(String title,Instructor i){
		this.title = title;
		this.i = i;
		this.rating = 0;
		
	}
	public void setRating(int rating){
		
		this.rating = this.rating + (rating + Student.instance);
		
	}
	
}
