package com.constructor.level2;



public class Manager extends Employee {

    private String designation;

    Manager(int employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    // Accessing public & protected members
    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID); 
        System.out.println("Department  : " + department);  
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + getSalary()); 
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(201, "IT", 75000, "Project Manager");

        m1.displayManagerDetails();
        m1.setSalary(85000);
        System.out.println("Updated Salary : " + m1.getSalary());
    }
}
