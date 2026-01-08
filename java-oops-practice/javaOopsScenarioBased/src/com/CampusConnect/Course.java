package com.CampusConnect;

class Course {

    private String courseName;
    private Faculty faculty;
    private Student[] students;
    private int count;

    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new Student[10];
        count = 0;
    }

    public void addStudent(Student s) {
        students[count++] = s;
        System.out.println(s.name + " enrolled in " + courseName);
    }

    public void removeStudent(Student s) {
        for (int i = 0; i < count; i++) {
            if (students[i] == s) {
                students[i] = students[count - 1];
                count--;
                System.out.println(s.name + " dropped from " + courseName);
                return;
            }
        }
    }

    public void showCourseInfo() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Faculty     : " + faculty.name);
        System.out.println("Students    : " + count);
    }
}
