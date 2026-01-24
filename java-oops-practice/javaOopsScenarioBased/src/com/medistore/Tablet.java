package com.medistore;
import java.time.LocalDate;

public  class Tablet extends Medicine{
	Tablet(String name,double price,LocalDate expDate){
		super(name,price,expDate);
	}
	
	@Override
	public boolean checkExpiry() {
		return date.isAfter(LocalDate.now());
	}
	
	@Override
	public void sell(int quantity) {
		if (!checkExpiry()) {
            System.out.println(name + " is expired ");
            return;
        }

        if (reduceStock(quantity)) {
            calculateCost(quantity, 0.10); 
            System.out.println(quantity + " Tablets sold");
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
