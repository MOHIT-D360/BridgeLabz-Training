package com.multithreading.downloadmanager;

public class File implements Runnable{
 private String name;
 private int progress ;
 File(String name){
	 this.name = name;
	 progress = 0;
 }

 public void run() {
	 while(progress<=100) {
		 System.out.println("[ "+Thread.currentThread().getName()+" ]" + " Downloading "+ name + " :"+progress + "%");
		 progress++;
		 try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
	 }
	
 }

}
