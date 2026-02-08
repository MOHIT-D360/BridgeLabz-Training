package com.multithreading.downloadmanager;

public class DownlaodManager {
	public static void main(String[] args) throws Exception{
		File f1 = new File("Document.pdf");
		File f2 = new File("Image.jpg");
		File f3 = new File("Video.mp4");
		
		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f2);
		Thread t3 = new Thread(f3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("All downloadds complete !");
		
	}
}
