package com.javagenerics.multileveluniversitycoursemanagementsystem;

public class Main {
	public static void main(String [] args) {
		Course<ExamCourse> examCourse = new Course<>("Maths Exam",2,new ExamCourse());
		System.out.println(examCourse.toString());
		
		Course<ResearchCourse> researchCourse = new Course<>("Research  Exam",2,new ResearchCourse());
		System.out.println(researchCourse.toString());
		
		Course<AssignmentCourse> AssignmentCourse = new Course<>("assignment Exam",4,new AssignmentCourse());
		System.out.println(AssignmentCourse.toString());
		
	}
}
