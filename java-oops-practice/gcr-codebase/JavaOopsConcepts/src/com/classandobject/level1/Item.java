package com.classandobject.level1;

public class Item {
	String[] itemCode;
	String[] itemName;
	double[] price;
	
	Item(String[] itemCode,String[] itemName,double[] price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void displayItems(int i) {
		System.out.println("item code :"+ itemCode[i]);
		System.out.println("item name :"+ itemName[i]);
		System.out.println("price :"+ price[i]);
	
	}
	
	public static void main(String[] args) {
		String[] itemName= {"Water bottle","Rice","blackboard"};
		String[] itemCode= {"01AA","01BB","02AA"};
		double[] price= {500,700,400};
		Item item1 = new Item(itemName, itemCode,price );
		
		for (int i = 0; i < price.length; i++) {
			item1.displayItems(i);
		}

	}

}
