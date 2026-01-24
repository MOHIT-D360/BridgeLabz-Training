package com.medistore;
import java.time.LocalDate;

public  class Syrup extends Medicine{

    Syrup(String name, double price, LocalDate expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }
	
	@Override
	public boolean checkExpiry() {
		return date.isAfter(LocalDate.now());
	}
	
	@Override
	public void sell(int units) {
		if (!checkExpiry()) {
            System.out.println(name + " is expired ");
            return;
        }

        if (reduceStock(units)) {
            calculateCost(units, 0.05); 
            System.out.println(units + " Tablets sold");
        } else {
            System.out.println("Insufficient stock ");
        }
	}
	
	public void printDetails() {
        System.out.println("[Tablet] " + name +
                " | ₹" + price +
                " | Stock: " + getQuantity());
    }

	
	
}
