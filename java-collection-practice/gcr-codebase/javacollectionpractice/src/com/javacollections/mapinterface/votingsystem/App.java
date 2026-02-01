package com.javacollections.mapinterface.votingsystem;
import java.util.*;
public class App {
	public static void main(String[] args) {
		JavaMap jm = new JavaMap();
		
		Vote v1 = new Vote("Mohit",40);
		Vote v2 = new Vote("Arun",50);
		Vote v3 = new Vote("Abuzar",20);
		
		jm.insert(v1);
		jm.insert(v2);
		jm.insert(v3);
		
		jm.display();
		System.out.println("----------------------------------");
		jm.displayInOrder();
	}
}
