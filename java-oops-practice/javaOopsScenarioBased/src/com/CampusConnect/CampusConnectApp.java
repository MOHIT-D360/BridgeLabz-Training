package com.CampusConnect;

public class CampusConnectApp {

    public static void main(String[] args) {

        Faculty teacher = new Faculty("Dr. Sharma","sharma@college.edu",101,"Computer Science");

        Student s1 = new Student("Mohit","mohit@college.edu",201);

        Student s2 = new Student("Ravi","ravi@college.edu",202);

        Course ds = new Course("Data Structures", teacher);

        s1.enrollCourse(ds);
        s2.enrollCourse(ds);

       
        teacher.assignGrade(s1, 9);
        teacher.assignGrade(s1, 10);
        teacher.assignGrade(s2, 8);

        System.out.println("\n--- STUDENT DETAILS ---");
        s1.printDetails();
        s2.printDetails();

        System.out.println("\n--- FACULTY DETAILS ---");
        teacher.printDetails();
    }
}
