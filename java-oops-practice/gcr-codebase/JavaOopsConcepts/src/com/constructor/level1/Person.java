package com.constructor.level1;

public class Person {
	private String gender ;
	private double height ;
	private double weight;
	
	Person(String gender , double height ,double weight){
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	Person (Person temp){
		this.gender = temp.gender;
		this.height = temp.height;
		this.weight = temp.weight;
	}
	
	public void display() {
		System.out.println("Gender :"+ gender);
		System.out.println("height :"+ height);
		System.out.println("weight :"+ weight);
		
	}
	public static void main(String[] args) {
		
		Person mohit = new Person("male",5.11,70.900);
		Person sona = new Person("female",5.07,55.5);
		
		Person rohit = new Person(mohit);
		rohit.display();
		System.out.println("");
		sona.display();
		System.out.println("");
		mohit.display();
		

	}

}
