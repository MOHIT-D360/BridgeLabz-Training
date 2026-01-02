package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {
	protected String platform;
	protected boolean isRecorded;
	
public	OnlineCourse(String courseName,String duration,String platform,boolean isRecorded){
		super(courseName,duration);
		this.platform =platform ;
		this.isRecorded = isRecorded;
		
	}
	@Override
	void display()
	{
		super.display();
		System.out.println("plateform       :"+platform);
		System.out.println("Is recorded     :"+isRecorded);
	}
}
