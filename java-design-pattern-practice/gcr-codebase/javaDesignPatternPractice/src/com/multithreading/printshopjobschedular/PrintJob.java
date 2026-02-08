package com.multithreading.printshopjobschedular;

public class PrintJob implements Runnable{
	String name;
	int pages;
	int priorityLevel;
	
	PrintJob(String name,int pages,int priorityLevel){
		this.name = name;
		this.pages = pages;
		this.priorityLevel = priorityLevel;
	}
	public int getPriority() {
		return priorityLevel;
	}
	public void run() {
		System.out.println("Starting print jobs...");
		int i=0;
		while(i<=pages) {
		if(pages>=1&&pages<=5) {
			System.out.println("[High Priority] "+ "Printing "+ name + " page "+ (i++) +" of 5");
		}
		else if(pages>=5&&pages<=8){
			System.out.println("[Medium Priority] "+ "Printing "+ name + " page "+ (i++) + " of 5");
		}
		else if(pages>=8) {
			System.out.println("[Low Priority] "+ "Printing "+ name + " page "+ (i++) + " of 5");
		}
		try {
			Thread.sleep(200);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}
}
