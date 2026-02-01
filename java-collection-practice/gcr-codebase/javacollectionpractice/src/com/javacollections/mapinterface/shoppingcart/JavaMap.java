package com.javacollections.mapinterface.shoppingcart;
import java.util.*;

public class JavaMap {
 Map<Product,Double> hashmap = new HashMap<>();
 Map<Product,Double> linkedhashmap = new LinkedHashMap<>();
 Map<Product,Double> treemap = new TreeMap<>();
 
 void insert(Product p) {
	 double value = p.getPrice();
	 hashmap.put(p, value);
	 linkedhashmap.put(p, value);
	 treemap.put(p, value);
 }
 
 void displayOrderwise() {
	 System.out.println(linkedhashmap);
 }
 void displaySortingwise() {
	 System.out.println(treemap);
 }
 
}
