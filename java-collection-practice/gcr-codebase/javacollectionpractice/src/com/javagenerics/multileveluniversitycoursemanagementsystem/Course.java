package com.javagenerics.multileveluniversitycoursemanagementsystem;

public class Course<T extends CourseType> {
	String name;
	int duration;
	T courseType;
	
	
	public Course(String name,int duration,T courseType) {
		this.name = name;
		this.duration = duration;
		this.courseType = courseType;
	}
	public String toString() {
		return name+ " "+ duration + " "+ courseType.getType();
	}
}
