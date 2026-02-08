package com.multithreading.printshopjobschedular;
import java.time.*;
public class PrintShopApp {
	public static void main(String[] args) throws Exception{
		PrintJob p1 = new PrintJob("Job1",10,5);
		PrintJob p2 = new PrintJob("Job2",5,8);
		PrintJob p3 = new PrintJob("Job3",15,3);
		PrintJob p4 = new PrintJob("Job4",8,6);
		PrintJob p5 = new PrintJob("Job5",12,7);
		
		
		long startTime = System.currentTimeMillis();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(p4);
		Thread t5 = new Thread(p5);
		
		t1.setPriority(p1.getPriority());
		t2.setPriority(p2.getPriority());
		t3.setPriority(p3.getPriority());
		t4.setPriority(p4.getPriority());
		t5.setPriority(p5.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time: "+(endTime-startTime)+ " ms");
	}
}
