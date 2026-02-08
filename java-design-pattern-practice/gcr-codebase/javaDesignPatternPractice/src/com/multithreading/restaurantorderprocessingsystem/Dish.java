package com.multithreading.restaurantorderprocessingsystem;

public class Dish implements Runnable{
	String name;
	int time;
	int progress;
	
	Dish(String name,int time){
		this.name = name;
		this.time= time;
		this.progress = 0;
	}
	int effectiveTime =(int) time/4;
	
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Started preparing "+name);
		while(progress<=100) {
			progress +=25;
			if(progress==25) {
				System.out.println(Thread.currentThread().getName() +" Started preparing : "+name+ " 25% complete");
			}
			else if(progress ==50) {
				System.out.println(Thread.currentThread().getName() +" Started preparing : "+name+ " 50% complete");
			}
			else if(progress == 75) {
				System.out.println(Thread.currentThread().getName() +" Started preparing : "+name+ " 75% complete");
			}
			else if(progress == 100) {
				System.out.println(Thread.currentThread().getName() +" Started preparing : "+name+ " 100% completed");
			}
			
			try {Thread.sleep(effectiveTime);}catch(Exception e) {System.out.println(e);}
		}
	}
}
