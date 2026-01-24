package com.FoodLoop;

public class FoodLoopApp {
	
	public static void main(String [] args) {
		
	
	FoodItem[] f = new FoodItem[100];
	f[0] = new Veg("Butter panner",250.0);
    f[1] = new NonVeg("Butter chicken",330.00);
    f[2] = new Veg("Roti",7);
    f[3] = new Veg("Dal makhni",150.0);
    f[4] = new NonVeg("Biriyani",290.00);
    f[5] = new Veg("Rice",60);
    
    Order o1 = new Order(f);
    
    
    
    o1.placeOrder();
    System.out.println("------ Details -------------");
    o1.getDetails();
    
	}
	
}
