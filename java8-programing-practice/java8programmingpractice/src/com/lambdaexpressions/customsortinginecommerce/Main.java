package com.lambdaexpressions.customsortinginecommerce;
import java.util.*;
//import java.util.stream.Collectors;
	
public class Main {
//	double price,double rating ,String name,double discount
public static void main(String[] args) {
	List<Shop> products = new ArrayList<>();
	products.add(new Shop(60000,4.5,"Laptop",10));
	products.add(new Shop(30000,4.2,"Phone",15));
	products.add(new Shop(3000,4.8,"Headphones",5));
	
	PriceComparator<Shop> byRating = (p1,p2)->Double.compare(p1.rating, p2.rating);
	
	PriceComparator<Shop> byDiscount= (p1,p2)->Double.compare(p1.discount,p2.discount);
	
	PriceComparator<Shop> byPrice= (p1,p2)->Double.compare(p1.price,p2.price);
	
	
	Collections.sort(products,byRating);
	System.out.println("Sorted by rating");
	products.forEach(System.out::println);
	
	
	Collections.sort(products,byPrice);
	System.out.println("Sorted by Price");
	products.forEach(System.out::println);
	
	
	
	Collections.sort(products,byDiscount);
	System.out.println("Sorted by Discount");
	products.forEach(System.out::println);
	
}
}
