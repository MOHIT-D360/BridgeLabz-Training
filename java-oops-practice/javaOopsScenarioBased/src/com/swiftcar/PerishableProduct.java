package com.swiftcar;

public class PerishableProduct extends Product{
	private int lifeInMonth ;
	
	PerishableProduct(String name,double price,String category,int lifeInMonth){
			super( name, price, category);
			this.lifeInMonth = lifeInMonth;
			
	}
	
	public void getProductDetails() {
		System.out.println("Name      :"+ name);
		System.out.println("price     :"+price);
		System.out.println("category  :"+ category);
		System.out.println("lifeInMonth  :"+ lifeInMonth);
	}
}
