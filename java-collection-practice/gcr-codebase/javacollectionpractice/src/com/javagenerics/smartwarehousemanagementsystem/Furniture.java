package com.javagenerics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem{
	int lifeInYear;
	Furniture(String name,int id,int lifeInYear){
		super(name,id);
		this.lifeInYear = lifeInYear;
		
	}
	
}
