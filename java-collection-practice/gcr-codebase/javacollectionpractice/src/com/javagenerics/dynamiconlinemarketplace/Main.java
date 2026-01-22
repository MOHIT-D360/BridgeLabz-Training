package com.javagenerics.dynamiconlinemarketplace;

import java.util.*;

public class Main {
	public static void main(String [] args) {
		Product<BookCategory> book =
				new Product<>("Java Book",500, new BookCategory());
		
		Product<ClothingCategory> shirt = 
				new Product<>("T shirt",1000, new ClothingCategory());
		
		  Product<GadgetCategory> mobile =
		            new Product<>("Smartphone", 20000, new GadgetCategory());
		  
		  
		  List<Product<? extends Category>> catalog = new ArrayList<>();
		  
		  catalog.add(book);
		  catalog.add(shirt);
		  catalog.add(mobile);
		  
		  for(Product<? extends Category> p : catalog) {
			  DiscountUtil.applyDiscount(p,10);
		  }
	}
}
