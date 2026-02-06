package com.collectors;
import java.util.*;
import java.util.stream.*;

class Employee {
	String name;
	String department;
	double salary;
	Employee(String name,String department,double salary){
		this.name = name;
		this.department= department;
		this.salary = salary;
		
	}
}
public class EmployeeSalaryCategorization {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("mohit","developer",53300));
		list.add(new Employee("bhumi","analyst",33300));
		list.add(new Employee("harshit","developer",53300));
		list.add(new Employee("tarun","SDE2",93300));
		list.add(new Employee("suryansh","analyst",23300));
		list.add(new Employee("vaibhav","sales",18000));
		
		Map<String,Double> hm = list.stream()
				.collect(Collectors.groupingBy(x->x.department,Collectors.averagingDouble(x->x.salary)));
		System.out.println(hm);
	}
}
