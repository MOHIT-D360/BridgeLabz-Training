package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{
	private String department;
	
	public FullTimeEmployee(int id,String name,double baseSalary) {
		super(id,name,baseSalary);
	}
	@Override
	double calculateSalary() {
		return baseSalary;
	}
	@Override
	public void assignDepartment(String deptName) {
		this.department = deptName;
		
	}
	@Override
	public String getDepartmentDetails() {
		return department;
	}
}
