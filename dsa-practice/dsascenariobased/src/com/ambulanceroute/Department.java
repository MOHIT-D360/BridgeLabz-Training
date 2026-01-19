package com.ambulanceroute;

public class Department {
	Department next;
	String title;
	Department prev;
	boolean isOpen;
	Patient p;
	
	Department(String title){
		this.title = title;
		this.next = null;
		this.prev = null;
		this.isOpen  = false;
		this.p = null;
	}
	String getTitle() {
		return title;
	}
	void put(Patient p) {
		this.p = p;
	}
}
