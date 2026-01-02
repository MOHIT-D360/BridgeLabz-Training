package com.inheritance.hierarchicalinheritance.schoolsystem;


public class Teacher extends Person{
    private String subject ;
    Teacher(String name, int age, String subject){
        super(name,age);
        this.subject = subject;

    }
    @Override
    public void display() {
        System.out.println("---Teacher Details---");
        super.display();
        System.out.println("Subject :"+subject);

    }
}
