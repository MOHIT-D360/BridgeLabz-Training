package com.smartcheckout;

import java.util.*;

class SmartCheckout {

    Queue<Customer> customerQueue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    // Add customer to queue
    void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.name + " added to billing queue");
    }

    // Add item to store
    void addItem(String item, int price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    // Process billing for first customer
    void processBilling() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;

        System.out.println("\nBilling for: " + customer.name);

        for (String item : customer.items) {
            if (!priceMap.containsKey(item)) {
                System.out.println(item + " not available");
                continue;
            }

            int stock = stockMap.get(item);
            if (stock > 0) {
                int price = priceMap.get(item);
                totalBill += price;
                stockMap.put(item, stock - 1);

                System.out.println(item + " added | Price: " + price);
            } else {
                System.out.println(item + " is out of stock");
            }
        }

        System.out.println("Total Bill = ₹" + totalBill);
    }
}