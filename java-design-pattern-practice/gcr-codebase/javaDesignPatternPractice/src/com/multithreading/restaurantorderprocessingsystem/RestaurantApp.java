package com.multithreading.restaurantorderprocessingsystem;

public class RestaurantApp {
public static void main(String[] args) throws Exception {
	Dish  d1 = new Dish("Pizza",3000);
	Dish  d2 = new Dish("Pasta",2000);
	Dish  d3 = new Dish("Salad",1000);
	Dish  d4 = new Dish("Burger",2500);
	
	Thread t1 = new Thread(d1,"Chef-1");
	Thread t2 = new Thread(d2,"Chef-2");
	Thread t3 = new Thread(d3,"Chef-3");
	Thread t4 = new Thread(d4,"Chef-4");
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	
	System.out.println("Kitchen Closed");
}
}
