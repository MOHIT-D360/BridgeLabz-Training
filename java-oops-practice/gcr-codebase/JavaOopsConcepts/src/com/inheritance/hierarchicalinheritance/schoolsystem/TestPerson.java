package com.inheritance.hierarchicalinheritance.schoolsystem;


public class TestPerson {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ramesh", 35, "Mathematics");
        Student student = new Student("Suresh", 15, "A");
        Staff staff = new Staff("Rajesh", 40, "Librarian");

        teacher.display();
        student.display();
        staff.display();
    }
}
