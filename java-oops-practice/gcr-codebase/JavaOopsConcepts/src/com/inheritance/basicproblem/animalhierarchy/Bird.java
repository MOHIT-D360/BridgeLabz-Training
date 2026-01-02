package com.inheritance.basicproblem.animalhierarchy;

public class Bird extends Animal{
	Bird(String name, int age){
		super(name,age);
		
	}
	@Override
	 void makeSound() {
		System.out.println("Birs is chirping........... ");
	 }
	
	
	public static void main(String [] args) {
		Dog d1 = new Dog("deepak",5);
		Cat pussy = new Cat("pussy",3);
		Bird sparrow = new Bird("sparrow",1);
		
		d1.makeSound();
		pussy.makeSound();
		sparrow.makeSound();
	}
}