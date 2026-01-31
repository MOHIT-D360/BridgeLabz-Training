package com.reflection.dependacyinjection;

public class Main {

    public static void main(String[] args) {

       
        Car car = SimpleDIContainer.createObject(Car.class);

        car.drive();
    }
}
