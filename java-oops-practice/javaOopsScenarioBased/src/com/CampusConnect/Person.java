package com.CampusConnect;

public abstract  class Person {
	protected String name;
	protected String email;
	protected int id;
	
	public Person(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	abstract void printDetails();
	

}
