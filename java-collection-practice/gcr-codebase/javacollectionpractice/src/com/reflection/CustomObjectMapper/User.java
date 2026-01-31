package com.reflection.CustomObjectMapper;

class User {
    private String name;
    private int age;
    private String email;

    public User() {
        // default constructor required
    }

    public void display() {
        System.out.println(
            "Name: " + name + ", Age: " + age + ", Email: " + email
        );
    }
}
