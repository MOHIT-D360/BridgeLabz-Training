package com.petpal;

public abstract class Pet implements IInteractable{
	protected String name;
	String type;
	protected int age;
	
	private int hunger;
	private int energy;
	private int mood;
	
	
	Pet(String name,int age){
		this.name = name;
		this.type = this.getClass().getSimpleName();
		this.age = age;
		
		this.hunger = 50;
		this.energy = 40;
		this.mood = 70;
		
	}
	
	 Pet(String name, int age, int hunger, int energy, int mood) {
	        this.name = name;
	        this.age = age;
	        this.hunger = hunger;
	        this.energy = energy;
	        this.mood = mood;
	    }
	 
	 protected void changeHunger(int value) {
	        hunger = Math.max(0, Math.min(100, hunger + value));
	    }

	    protected void changeEnergy(int value) {
	        energy = Math.max(0, Math.min(100, energy + value));
	    }

	    protected void changeMood(int value) {
	        mood = Math.max(0, Math.min(100, mood + value));
	    }
	    abstract void makeSound();
	    void showStatus() {
	    	System.out.println("Name         :"+name);
	    	System.out.println("Type         :"+type);
	    	System.out.println("hunger       :"+hunger);
	    	System.out.println("energy       :"+energy);
	    	System.out.println("mood         :"+mood);
	    	

	    	
	    }
	
}
