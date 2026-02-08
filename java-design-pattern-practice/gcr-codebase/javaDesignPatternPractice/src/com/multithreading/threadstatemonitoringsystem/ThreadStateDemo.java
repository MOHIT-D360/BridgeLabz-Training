package com.multithreading.threadstatemonitoringsystem;

public class ThreadStateDemo {
	public static void main(String[] args) {
		TaskRunner t1 = new TaskRunner();
		t1.setName("Task-1");
		Monitor m = new Monitor(t1);
		System.out.println("Before start :"+t1.getState());
		
		m.start();
		t1.start();
		
		
	}
}
