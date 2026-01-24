package com.petpal;

public class Cat extends Pet{
	Cat(String name,int age){
		super(name,age);
	}
	
	@Override
	public void feed() {
		changeHunger(-40);
		changeMood(10);
		System.out.println("Nice meal");
	}
	public void play() {
		changeEnergy(-30);
		changeMood(15);
		System.out.println("Love to play");
		
	}
	
	public void sleep() {
		 changeEnergy(25);
	        System.out.println("is sleeping ");
	}
	
	public void makeSound()
{
		System.out.println("Meow meow......");
}
}
