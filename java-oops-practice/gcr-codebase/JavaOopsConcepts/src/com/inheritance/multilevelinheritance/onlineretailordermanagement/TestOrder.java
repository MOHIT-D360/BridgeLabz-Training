package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class TestOrder {

	public static void main(String[] args) {
		    Order o1 = new Order(101, "01-09-2026");
	        Order o2 = new ShippedOrder(102, "02-09-2026", 123);
	        Order o3 = new DeliveredOrder(103, "03-09-2026", 999, "05-09-2026");

	        System.out.println(o1.getOrderStatus());
	        System.out.println(o2.getOrderStatus());
	        System.out.println(o3.getOrderStatus());

	}

}
