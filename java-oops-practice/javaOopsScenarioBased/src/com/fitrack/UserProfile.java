package com.fitrack;

class UserProfile {
    private String name;
    private int age;
    private double weight;   
    private String goal;


    UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Maintain Fitness";
    }

   
    UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public String getGoal() {
        return goal;
    }

   
    public double getWeight() {
        return weight;
    }
}
