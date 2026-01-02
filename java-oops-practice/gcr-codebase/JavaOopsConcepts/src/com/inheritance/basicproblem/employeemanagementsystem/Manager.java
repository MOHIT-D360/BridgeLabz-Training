package com.inheritance.basicproblem.employeemanagementsystem;

public class Manager extends Employee{
	private int teamSize;
	Manager(String name,int id ,double salary,int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	
	void displayDetails() {
		System.out.println("Name      :"+name);
		System.out.println("ID        :"+id);
		System.out.println("Salary    :"+salary);
		System.out.println("teamSize  :"+teamSize);
	}
}
