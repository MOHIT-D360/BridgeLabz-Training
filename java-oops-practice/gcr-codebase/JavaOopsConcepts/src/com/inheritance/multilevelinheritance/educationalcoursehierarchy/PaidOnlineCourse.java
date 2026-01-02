package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
	private double fee;
	private double discount;
	
public	PaidOnlineCourse(String courseName,String duration,String platform,boolean isRecorded,double fee,double discount){
		
			super(courseName,duration,platform,isRecorded);
			this.fee = fee;
			this.discount = discount;
			
		
	}
	
	void display() {
		super.display();
		System.out.println("Fee          :"+fee);
		System.out.println("discount     :"+fee*(discount/100));
	}
}
