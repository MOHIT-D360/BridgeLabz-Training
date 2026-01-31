package com.annotations.overrides;

public class Dog extends Parent{
	@Override
	public void makeSound() {
		System.out.println("Barking");
	}
}
