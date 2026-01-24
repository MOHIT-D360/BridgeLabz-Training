package com.bookbazaar;

public class OrderItems {
    Book book;
    int quantity;

    OrderItems(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    double getItemTotal() {
        double base = book.price * quantity;
        double discount = book.applyDiscount(quantity);
        return base - discount;
    }
}