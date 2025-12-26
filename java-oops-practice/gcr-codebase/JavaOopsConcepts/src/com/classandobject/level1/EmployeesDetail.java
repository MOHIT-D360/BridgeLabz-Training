package com.classandobject.level1;

public class EmployeesDetail {
	
		String name;
		int id;
		double salary ;
		
		
		// constructor
		
		EmployeesDetail(String name,int id,double salary){
			this.name = name;
			this.id = id;
			this.salary = salary;
			
		}
		
		public void displayEmployee() {
			System.out.println("Employee name : "+ name);
			System.out.println("Employee's id : "+ id);
			System.out.println("Employee's salary : "+ salary);
		}
	
	public static void main(String[] args) {
		EmployeesDetail E1 = new EmployeesDetail("Mohit",9982,58000.0);
		E1.displayEmployee();

	}

}
