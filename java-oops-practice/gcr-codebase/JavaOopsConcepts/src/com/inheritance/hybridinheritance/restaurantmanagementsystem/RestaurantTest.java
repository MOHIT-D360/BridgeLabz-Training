package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class RestaurantTest {

	public static void main(String[] args) {
			Worker w1 = new Chef("Rohit",1221);
			Worker w2 = new Waiter("Suresh", 1223);
			
			w1.performDuties();
			w2.performDuties();
			

	}

}
