package com.skillforge;

public class User {
	protected String name ;
	protected String  category;
	
	User(String name){
		this.name  = name;
		this.category = this.getClass().getSimpleName();
	}
	
	
}
