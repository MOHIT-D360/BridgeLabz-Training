package com.ewalletapplication;

public class EWalletApp {
    public static void main(String[] args) {

        User u1 = new User("Mohit", new Wallet(5000));
        User u2 = new User("Rahul", new Wallet(2000));

        u1.getWallet().transferTo(u2, 1500);
        u1.getWallet().transferTo(u2, 500);

        u1.showBalance();
        u2.showBalance();

        
        u1.showTransactionHistory();
    }
}
