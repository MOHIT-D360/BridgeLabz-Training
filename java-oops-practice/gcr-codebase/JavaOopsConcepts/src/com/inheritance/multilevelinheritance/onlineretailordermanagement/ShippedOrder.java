package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order{
	protected int trackingNumber;
	
	ShippedOrder(int orderId,String orderDate,int trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
	}
	void show() {
		super.show();
		System.out.println("Tracking Number     :"+ trackingNumber);
	}
	@Override
	String getOrderStatus() {
		return "Order Shipped";
	}
}
