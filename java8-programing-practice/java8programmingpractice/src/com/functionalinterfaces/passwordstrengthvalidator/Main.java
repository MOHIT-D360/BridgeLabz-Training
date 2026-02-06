package com.functionalinterfaces.passwordstrengthvalidator;

public class Main {

    public static void main(String[] args) {

        String password1 = "Hello123";
        String password2 = "weakpass";

        System.out.println(password1 + " strong? " +
                SecurityUtils.isStrongPassword(password1));

        System.out.println(password2 + " strong? " +
                SecurityUtils.isStrongPassword(password2));
    }
}
