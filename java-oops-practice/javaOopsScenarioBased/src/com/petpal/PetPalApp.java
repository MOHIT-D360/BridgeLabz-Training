package com.petpal;

public class PetPalApp {
    public static void main(String[] args) {
    	Pet[] p = new Pet[3];
    	p[0] = new Dog("bruno",3);
    	p[1] = new Cat("billi",2);
    	p[2] = new Bird("cannry",1);
      
    	for(Pet prr : p) {
    		prr.makeSound();
    		prr.feed();
    		prr.play();
    		prr.showStatus();
    		  System.out.println("----------------");
    	}
      
        
    }
}
