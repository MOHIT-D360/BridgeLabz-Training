package com.artify;

public  class ArtWorkApp {
	public static void main(String [] args) {
		
		Artwork a1 = new DigitalArt("Mohit","A wildLife picture",1570.9);
		Artwork a2 = new DigitalArt("Rohit","A Galaxy picture",2341.9);
		
		User u1 = new User("Akash",150000.00);
		
		System.out.println("----Details-----");
		
		a1.printDetails();
		a2.printDetails();
		
		System.out.println("----Buying-----");
		
		a1.purcharse(u1);
		a2.license(u1, LicenseType.exclusive);
		
		
		
		
		
	}
	
}
