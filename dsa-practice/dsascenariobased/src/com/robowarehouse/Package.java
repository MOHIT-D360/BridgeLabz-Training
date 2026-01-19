package com.robowarehouse;

public class Package {
	double weight;
	String name;
	
	Package(double weight,String name){
		this.weight = weight;
		this.name = name;
		
	}
	void display() {
		System.out.println("Package name   :"+ name);
		System.out.println("Package weight :"+weight);
	}
}
