package com.constructor.level2;

public class PostgraduateStudent extends Student{
	private String branch = "Ai";
	PostgraduateStudent(int rollnumber,String name, double cgpa,String branch){
		super(rollnumber,name,cgpa);
		this.branch = branch;
		
	}
	
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number   : " + rollNumber); // public
        System.out.println("Name : " + name);       // protected
        System.out.println("CGPA : " + getCgpa());  
        System.out.println("Specialization: " + branch);
    }

	
	
	
	
	public static void main(String[] args) {
		
		PostgraduateStudent stu1 = new PostgraduateStudent(100, "Mohit Dixit", 8.7, "Data science");
		stu1.displayPostgraduateDetails();
		stu1.setCgpa(9.8);
		System.out.println("Updated cgpa is :"+ stu1.getCgpa());
	}

}
