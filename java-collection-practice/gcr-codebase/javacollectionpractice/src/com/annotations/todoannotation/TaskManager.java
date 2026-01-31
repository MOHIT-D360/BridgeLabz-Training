package com.annotations.todoannotation;

public class TaskManager {
	@Todo (task = "Sort the array" ,assignedTo= "Rohit" , priority = "Hard")
	void sorting() {
		
	}
	@Todo (task = "modify the array" ,assignedTo= "Suman" , priority = "medium")
	void modifying() {
		
	}
	@Todo (task = "insert element in an array", assignedTo = "Mohit", priority = "easy")
	void insert() {
		
	}
}
