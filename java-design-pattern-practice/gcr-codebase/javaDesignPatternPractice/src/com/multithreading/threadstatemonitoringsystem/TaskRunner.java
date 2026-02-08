package com.multithreading.threadstatemonitoringsystem;

public class TaskRunner extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
			long sum =0;
			for(int i=0;i<1_000_000;i++) {
				sum+=i;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
