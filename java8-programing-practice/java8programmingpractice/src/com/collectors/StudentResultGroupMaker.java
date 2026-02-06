package com.collectors;
import java.util.*;
import java.util.stream.*;
class Student{
	String name;
	double grade;
	Student(String name,double grade){
		this.name = name;
		this.grade = grade;
		
	}
	public String toString() {
		return name;
	}
}
public class StudentResultGroupMaker {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Mohit",5.3));
		students.add(new Student("Rohit",4.3));
		students.add(new Student("Tarun",6.3));
		students.add(new Student("Varun",7.3));
		students.add(new Student("Motor",3.3));
		
		Map<Double,List<String>> result = students.stream().collect(
			Collectors.groupingBy(
					s->s.grade,Collectors.mapping(m->m.name, Collectors.toList())
					));
			
		for(Map.Entry<Double,List<String >>mp: result.entrySet()) {
			  System.out.println("Key : " + mp.getKey());
			    System.out.println("Values : " + mp.getValue());
		}
		
	}
}
