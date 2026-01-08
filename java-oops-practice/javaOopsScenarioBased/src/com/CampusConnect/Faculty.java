package com.CampusConnect;

public class Faculty extends Person{
	private String department;

    Faculty(String name, String email, int id, String department) {
        super(name, email, id);
        this.department = department;
    }
    
    public void assignGrade(Student student, int grade) {
        student.addGradeByFaculty(grade);
        System.out.println("Grade " + grade + " assigned to " + student.name);
    }
    
    @Override
    void printDetails() {
        System.out.println("Faculty ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
    
}
