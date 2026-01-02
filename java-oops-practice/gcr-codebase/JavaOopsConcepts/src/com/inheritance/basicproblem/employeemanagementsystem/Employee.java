package com.inheritance.basicproblem.employeemanagementsystem;

public class Employee {
	protected String name ;
	protected int id;
	protected double salary ;
	
	Employee(String name,int id ,double salary){
		this.name = name;
		this.id = id ;
		this.salary = salary;
		
		
	}
	void displayDetails() {
		System.out.println("Name    :"+name);
		System.out.println("ID    :"+id);
		System.out.println("Salary    :"+salary);
		
	}
}
