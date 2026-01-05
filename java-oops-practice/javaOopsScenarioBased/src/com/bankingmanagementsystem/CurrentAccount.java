package com.bankingmanagementsystem;

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft not allowed!");
        }
    }
}
