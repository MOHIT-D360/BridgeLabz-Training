package com.skillforge;

public class Student extends User{
	private String subject ;
	private char grade;
	public  static int instance =0;
	Student(String name,String subject){
		super(name);
		this.subject = subject;
//		instance++;
	}
	public void  addRating(int rate) {
		instance++;
		Course.rating  = rate;
		
	}
	
}
