package com.bankingmanagementsystem;

abstract class Account {
    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
