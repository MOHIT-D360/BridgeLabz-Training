package com.bankingmanagementsystem;

public class BankApp {
    public static void main(String[] args) {

        Account savings = new SavingsAccount(5000, 5);
        Customer c1 = new Customer("Mohit", savings);
        c1.performOperations();

        System.out.println("------------------");

        Account current = new CurrentAccount(3000);
        Customer c2 = new Customer("Rahul", current);
        c2.performOperations();
    }
}
