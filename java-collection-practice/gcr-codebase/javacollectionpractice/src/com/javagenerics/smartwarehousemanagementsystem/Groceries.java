package com.javagenerics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem{
	int lifeInMonth;
	
	Groceries(String name,int id,int lifeInMonth){
		super(name,id);
		this.lifeInMonth = lifeInMonth;
	}
}
