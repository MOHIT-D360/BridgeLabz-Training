package com.javacollections.mapinterface;
import java.util.*;

class Employee{
	String name;
	String department;
	
	Employee(String name,String department){
		this.name = name;
		this.department = department;
		
	}
	String getName() {
		return name;
	}
	String getDepartment() {
		return department;
	}
	
	public String toString() {
		return name;
	}
}


public class GroupObjectByProperty {
 public static void main(String[] args) {
	List<Employee> list = new ArrayList<>();
	list.add(new Employee("Alice", "HR"));
	list.add(new Employee("Bob", "IT"));
	list.add(new Employee("Carol", "HR"));
	Map<String,ArrayList<Employee>> map = new HashMap<>();
	
	for(int i=0;i<list.size();i++) {
		String key = list.get(i).getDepartment();
		Employee value = list.get(i);
		if(map.containsKey(key)) {
			map.get(key).add(value);
		}
		else {
			map.put(key, new ArrayList<>());
			map.get(key).add(value);
		}
	}
	System.out.println(map);
}
 
}
