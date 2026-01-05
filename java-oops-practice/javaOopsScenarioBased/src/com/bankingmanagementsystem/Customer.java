package com.bankingmanagementsystem;

class Customer {
    private String name;
    private Account account;

    Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void performOperations() {
        account.deposit(1000);
        account.withdraw(500);

        if (account instanceof SavingsAccount) {
            ((SavingsAccount) account).calculateInterest();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
