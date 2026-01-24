package com.artify;



public class PrintArt extends Artwork{
	PrintArt(String artistName,String title
			, double price){
		super(artistName,title,price);
	}
	
	public void purcharse(User user) {
		
		if(price>user.getBalance()) {
			System.out.println("Insufficient balance");
		}
		else {
			double balance =(user.getBalance()) -price;
			user.setBalance(balance);
			
			System.out.println("Successfully purchased without licensing");
		}
	}
	public void license(User user,LicenseType license) {
		if(license == LicenseType.personal) {
			double licensePrice = price+500.0;
			if(licensePrice>user.getBalance()) {
				System.out.println("Insufficient balance");
			}
			else {
				double balance =(user.getBalance()) -licensePrice;
				user.setBalance(balance);
				
				System.out.println("Successfully purchased your balance is : "+ user.getBalance());
			}
			
		}
		else if(license == LicenseType.commercial) {
			
			double licensePrice = price+1000.0;
			if(licensePrice>user.getBalance()) {
				System.out.println("Insufficient balance");
			}
			else {
				double balance =(user.getBalance()) -licensePrice;
				user.setBalance(balance);
				
				System.out.println("Successfully purchased your balance is : "+ user.getBalance());
			}
			
			
		}
		else if (license == LicenseType.exclusive) {
			
			double licensePrice = price+1500;
			if(licensePrice>user.getBalance()) {
				System.out.println("Insufficient balance");
			}
			else {
				double balance =(user.getBalance()) -licensePrice;
				user.setBalance(balance);
				
				System.out.println("Successfully purchased your balance is : "+ user.getBalance());
			}
			
		}
	}
	
	
}
