package com.encapsulationandpolymorphism.employeemanagementsystem;

public class EmployeeTest {
	public static void main(String [] args) {
		Employee[] emp =  new Employee[2];
		emp[0] = new FullTimeEmployee(101,"Ramesh", 50000);
		emp[1] = new PartTimeEmployee(102,"mohit",80,500);
		
		((Department) emp[0]).assignDepartment("IT");
		((Department) emp[1]).assignDepartment("HR");
		
		for(Employee e : emp) {
			e.displayDetails();
			System.out.println("Department :"+ ((Department) e).getDepartmentDetails());
			System.out.println("-----------------------------------");
		}
		
	}
}
