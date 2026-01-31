package com.reflection.jsonrepresentation;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Mohit", 22, "Bhopal");

        String json = JsonUtil.toJson(p);
        System.out.println(json);
    }
}
