package com.medistore;
import java.time.LocalDate;
class Injection extends Medicine {

    Injection(String name, double price, LocalDate expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }

    @Override
    public boolean checkExpiry() {
        
        return date.isAfter(LocalDate.now());
    }

    @Override
    public void sell(int qty) {
        if (!checkExpiry()) {
            System.out.println(name + " is expired ❌");
            return;
        }

        if (reduceStock(qty)) {
            calculateCost(qty, 0.0); // no discount
            System.out.println(qty + " Injections sold");
        } else {
            System.out.println("Insufficient stock ❌");
        }
    }

  
    public void printDetails() {
        System.out.println("[Injection] " + name +
                " | ₹" + price +
                " | Stock: " + getQuantity());
    }
}
