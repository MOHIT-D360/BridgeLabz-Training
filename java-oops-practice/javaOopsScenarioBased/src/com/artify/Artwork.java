package com.artify;

public abstract class Artwork implements IPurchasable{
	protected String artistName;
	protected String title;
	protected double price;
//	protected LicenseType licenseType;
	
	
	public  Artwork(String artistName,String title
			, double price){
		this.artistName = artistName;
		this.title = title;
		this.price = price;
		
	}
	
	
	
	
	public void printDetails() {
		System.out.println("Artist Name  :"+ artistName);
		System.out.println("Title        :"+ title);
		System.out.println("Price        :"+ price);
//		System.out.println("LicenseType  :"+ licenseType);	
	}
	
}
