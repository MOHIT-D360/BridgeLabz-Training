package com.inheritance.hierarchicalinheritance.schoolsystem;


public class Staff extends Person{
    private String role ;
    Staff(String name, int age, String role){
        super(name,age);
        this.role = role;

    }
    @Override
    public void display() {
        System.out.println("---Staff Details---");
        super.display();
        System.out.println("Role :"+role);

    }
    
}
