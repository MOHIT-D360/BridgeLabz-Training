package com.constructor.level2;

public class Student {
	public int rollNumber ;
	protected String name ;
	private double CGPA;
	
	Student (int rollNumber , String name, double CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
		
	}
	public double getCgpa() {
		return CGPA;
	}
	public void setCgpa(double cgpa) {
		if(cgpa>=0 && cgpa<=10) {
			CGPA = cgpa;
		}else {
			System.out.println("Invalid");
		}
	}
	
	public void displayStudent() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }


}
