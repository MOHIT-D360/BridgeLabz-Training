package com.javagenerics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem{
	double comsumtion;
	Electronics(String name,int id,double comsumtion){
		super(name,id);
		this.comsumtion = comsumtion;
		
	}
}
