package com.javagenerics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
	String name;
	int id;
	
	WarehouseItem(String name,int id){
		this.name= name;
		this.id =id;
	}
	public String getName() {
		return name;
	}
}
