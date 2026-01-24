package com.bookbazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        Book b1 = new EBook(
                "Clean Code",
                "Robert C. Martin",
                500
        );

        Book b2 = new PrintedBook(
                "Java Complete Reference",
                "Herbert Schildt",
                800,
                5
        );

        b1.printDetails();
        b2.printDetails();

        Order order = new Order();

        order.addItem(b1, 1);
        order.addItem(b2, 2);

        OrderService service = new OrderService();
        service.checkout(order);
    }
}