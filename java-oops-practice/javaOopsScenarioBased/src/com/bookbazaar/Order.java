package com.bookbazaar;

public class Order {

    private OrderItems[] items;
    private int count;
    private OrderStatus status;

    Order() {
        items = new OrderItems[10];
        count = 0;
        status = OrderStatus.CREATED;
    }

    public void addItem(Book book, int quantity) {

        if (status != OrderStatus.CREATED) {
            System.out.println("❌ Cannot modify order now");
            return;
        }

        if (!book.reduceStock(quantity)) {
            System.out.println("❌ Not enough stock for " + book.title);
            return;
        }

        items[count++] = new OrderItems(book, quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getItemTotal();
        }
        return total;
    }

    
    void markPaid() {
        status = OrderStatus.PAID;
    }

    void cancel() {
        status = OrderStatus.CANCELLED;
    }

    public OrderStatus getStatus() {
        return status;
    }

	
}
