package com.javacollections.mapinterface.shoppingcart;
import java.util.*;
public class App {
	public static void main(String[] args) {
		JavaMap jm = new JavaMap();
		
		Product p1 = new Product("Box1",223.1);
		Product p2 = new Product("Box2",669.1);
		Product p3 = new Product("Box3",550.1);
		
		jm.insert(p1);
		jm.insert(p2);
		jm.insert(p3);
		
		// showing order wise;
		System.out.println("Displaying orderwise");
		System.out.println("__________________________");
		jm.displayOrderwise();
		
		System.out.println("--------------------------");
		
		// showing sorting wise;
		System.out.println("Displaying sortingwise");
		System.out.println("__________________________");
		jm.displaySortingwise();
	}
}
