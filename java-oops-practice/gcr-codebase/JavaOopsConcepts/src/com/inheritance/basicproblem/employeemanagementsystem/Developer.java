package com.inheritance.basicproblem.employeemanagementsystem;

public class Developer extends Employee{
	private String programmingLanguage;
	Developer(String name,int id ,double salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	void displayDetails() {
		System.out.println("Name      :"+name);
		System.out.println("ID        :"+id);
		System.out.println("Salary    :"+salary);
		System.out.println("Programming Language  :"+programmingLanguage);
	}
}