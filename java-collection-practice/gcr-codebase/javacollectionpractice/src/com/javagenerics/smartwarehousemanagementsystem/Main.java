package com.javagenerics.smartwarehousemanagementsystem;

public class Main {
	public static void main(String [] args) {
		
		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.push(new Electronics("Laptop",1,165));
		electronicsStorage.push(new Electronics("Mobile",2,65));
		
		Storage<Groceries> groceryStorage = new Storage<>();
		groceryStorage.push(new Groceries("Rice",1,2));
		groceryStorage.push(new Groceries("Wheat",2,1));
		
		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.push(new Furniture("Chair",1,5));
		furnitureStorage.push(new Furniture("Table",1,3));
		
		
		System.out.println("---Electronics----");
		WarehouseUtil.displayItems(electronicsStorage.getList());
		
		System.out.println("---Groceries----");
		WarehouseUtil.displayItems(groceryStorage.getList());
		
		System.out.println("---Furniture----");
		WarehouseUtil.displayItems(furnitureStorage.getList());
		
	}
}
