package com.javagenerics.smartwarehousemanagementsystem;
import java.util.*;
public class Storage<T extends WarehouseItem> {
	private List <T> l = new ArrayList<T>();
	
	
	public  void push(T obj) {
		l.add(obj);
	}
	
	public T getItem(int index) {
		return l.get(index);
	}
	public List<T> getList(){
		return l;
	}
		
}
