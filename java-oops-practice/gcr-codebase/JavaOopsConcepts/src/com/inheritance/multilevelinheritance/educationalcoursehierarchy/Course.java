package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class Course {
	protected String courseName;
	protected String duration;
	
	public Course(String courseName,String duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	
	void display(){
		System.out.println("courseName   :"+courseName);
		System.out.println("duration     :"+duration);
	}
}
