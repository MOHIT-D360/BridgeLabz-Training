package com.constructor.level2;

public class Course {
	private String courseName;
	private String duration;
	private double fee;
	
	private static String instituteName = "Technocrats";
	
	Course(String courseName,String duration,double fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		
	}
	public void displayCourseDetails() {
		System.out.println("Course name :"+courseName);
		System.out.println("duration :"+duration);
		System.out.println("fee :"+fee);
		System.out.println("Institute name is "+ instituteName);
	}
	public static void updateInstituteName(String name) {
		instituteName = name;
	}

	public static void main(String[] args) {
		Course c1 = new Course("Web Development" , "3 month" , 5000.90);
		c1.displayCourseDetails();
		Course.updateInstituteName("NIT Bhopal");
		c1.displayCourseDetails();
	}

}
