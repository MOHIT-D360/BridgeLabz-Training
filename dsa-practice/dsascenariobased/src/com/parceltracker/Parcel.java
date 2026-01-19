package com.parceltracker;

public class Parcel {
	String Cname;
	String address;
	int id;
	double price;
	
	Parcel(String Cname,String address,int id,double price){
		this.Cname= Cname;
		this.address = address;
		this.id = id;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("Customer name :"+Cname);
		System.out.println("Address       :"+address);
		System.out.println("id			  :"+id);
		System.out.println("price		  :"+price);
	}
	
	
}
