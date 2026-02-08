package com.multithreading.threadstatemonitoringsystem;
import java.util.*;
import java.time.*;
public class Monitor extends Thread{
	Thread t;
	Monitor(Thread t){
		this.t = t;
	}
	public void run() {
		while(true) {
			System.out.println(
				"[Monitor] "+t.getName()+" state: "+t.getState()	
					);
			if(t.getState() ==Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
