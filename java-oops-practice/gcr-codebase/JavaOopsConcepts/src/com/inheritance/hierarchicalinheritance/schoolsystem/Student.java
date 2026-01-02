package com.inheritance.hierarchicalinheritance.schoolsystem;


public class Student extends Person{
    private String grade;
    Student(String name, int age, String grade){
        super(name,age);
        this.grade = grade;
    }
    @Override
    public void display() {
        System.out.println("---Student Details---");
        super.display();
        System.out.println("Grade :"+grade);
    }
}