package com.bookbazaar;

public class PrintedBook extends Book{
	PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        
        return (quantity >= 2) ? 100 : 0;
    }

    @Override
    public void printDetails() {
        System.out.println("[Printed] " + title + " by " + author +
                           " ₹" + price + " | Stock: " + getStock());
    }
}