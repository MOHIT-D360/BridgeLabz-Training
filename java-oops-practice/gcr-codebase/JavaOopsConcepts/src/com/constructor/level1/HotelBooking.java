package com.constructor.level1;

public class HotelBooking {
	
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
		
	}
	HotelBooking(HotelBooking temp){
		this.guestName = temp.guestName;
		this.roomType = temp.roomType;
		this.nights = temp.nights;
	}
	
	public void  display() {
		System.out.println("Guest Name :"+ guestName);
		System.out.println("Room Type :"+ roomType);
		System.out.println("Nights :"+ nights);
	}

	public static void main(String[] args) {
		HotelBooking H1 = new HotelBooking("Mohit","Ac",7);
		HotelBooking H2 = new HotelBooking("Rohit","Non Ac",2);
		
		HotelBooking H3 = new HotelBooking(H1);
		H1.display();
		System.out.println("");
		H2.display();
		System.out.println("");
		H3.display();

	}

}
