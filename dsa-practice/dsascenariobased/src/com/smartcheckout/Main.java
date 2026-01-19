package com.smartcheckout;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();


        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 30, 2);
        checkout.addItem("Butter", 60, 1);

      
        Customer c1 = new Customer("Rahul",
                Arrays.asList("Milk", "Bread", "Butter"));

        Customer c2 = new Customer("Neha",
                Arrays.asList("Milk", "Milk", "Bread"));

        // Add customers to queue
        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        // Process billing
        checkout.processBilling();
        checkout.processBilling();
        checkout.processBilling(); 
    }
}