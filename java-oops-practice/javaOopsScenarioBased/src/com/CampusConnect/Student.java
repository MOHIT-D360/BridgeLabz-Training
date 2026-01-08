package com.CampusConnect;

public  class Student extends Person implements ICourseActions{
	 private int[] grades;
	    private int gradeCount;

	    Student(String name, String email, int id) {
	        super(name, email, id);
	        grades = new int[5];
	        gradeCount = 0;
	    }
	    
	    void addGradeByFaculty(int grade) {
	        if (gradeCount < grades.length) {
	            grades[gradeCount++] = grade;
	        }
	    }
	    
	    public double calculateGPA() {
	        if (gradeCount == 0) return 0;

	        int sum = 0;
	        for (int i = 0; i < gradeCount; i++) {
	            sum += grades[i];
	        }
	        return sum / (double) gradeCount;
	    }
	    @Override
	    public void enrollCourse(Course course) {
	        course.addStudent(this);
	    }
	    @Override
	    public void dropCourse(Course course) {
	        course.removeStudent(this);
	    }
	    @Override
	    void printDetails() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Name      : " + name);
	        System.out.println("GPA       : " + calculateGPA());
	    }
}
