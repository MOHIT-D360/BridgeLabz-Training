package com.inheritance.basicproblem.employeemanagementsystem;

public class Intern extends Employee{
	
	private String internShipPeriod;
	Intern(String name,int id ,double salary,String internShipPeriod){
		super(name,id,salary);
		this.internShipPeriod = internShipPeriod;
	}
	
	void displayDetails() {
		System.out.println("Name      :"+name);
		System.out.println("ID        :"+id);
		System.out.println("Salary    :"+salary);
		System.out.println("Internship period  :"+internShipPeriod);
	}

	public static void main(String[] args) {
		
		Employee e1= new Employee("Raj parmar",221421,45000.0);
		Manager m1= new Manager("Raj jain",211421,55000.0,7);
		Developer d1= new Developer("Mohit Dixit",201421,50000.0,"java");
		Intern i1= new Intern("surya singh",121421,23900.0,"3 month");
		
		e1.displayDetails();
		m1.displayDetails();
		d1.displayDetails();
		i1.displayDetails();
	}


}