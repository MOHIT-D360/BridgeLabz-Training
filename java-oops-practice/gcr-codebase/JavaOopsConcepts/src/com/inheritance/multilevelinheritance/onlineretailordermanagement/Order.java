package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class Order {
	protected int orderId ;
	protected String orderDate ;
	
	Order(int orderId,String orderDate){
		this.orderId= orderId;
		this.orderDate = orderDate;
		
		
	}
	void show() {
		System.out.println("Order id :"+ orderId);
		System.out.println("Order date :"+ orderDate);
	}
	
	String getOrderStatus() {
		return "Order Delivered";
	}
	
}
