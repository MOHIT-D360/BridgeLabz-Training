package com.petpal;

public class Dog extends Pet{
	Dog(String name,int age){
		super(name,age);
	}
	
	@Override
	public void feed() {
		changeHunger(-20);
		changeMood(20);
		System.out.println("Nice meal");
	}
	public void play() {
		changeEnergy(-15);
		changeMood(20);
		System.out.println("Love to play");
		
	}
	
	public void sleep() {
		 changeEnergy(25);
	        System.out.println("is sleeping ");
	}
	
	public void makeSound()
{
		System.out.println("Bakring......");
}
}
