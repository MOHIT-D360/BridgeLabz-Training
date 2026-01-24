package com.bookbazaar;

public class EBook extends Book {

    EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE); 
    }

    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.15;
    }

    @Override
    public void printDetails() {
        System.out.println("[EBook] " + title + " by " + author + "  price : " + price);
    }
}