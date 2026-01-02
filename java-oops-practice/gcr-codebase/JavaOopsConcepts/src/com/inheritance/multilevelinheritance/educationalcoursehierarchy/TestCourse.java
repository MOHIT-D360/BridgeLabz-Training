package com.inheritance.multilevelinheritance.educationalcoursehierarchy;



public class TestCourse {
    public static void main(String[] args) {

        Course[] courses = new Course[3];

        courses[0] = new Course("C Programming", "40");
        courses[1] = new OnlineCourse("Java OOPS", "50",
                                      "Coursera", true);
        courses[2] = new PaidOnlineCourse("Full Stack Web Dev", "120",
                                          "Udemy", true,
                                          4999, 30);

        for (Course c : courses) {
            c.display();   
            System.out.println("-----------------------");
        }
    }
}

