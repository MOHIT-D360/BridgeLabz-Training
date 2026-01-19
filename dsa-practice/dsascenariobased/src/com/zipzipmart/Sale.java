package com.zipzipmart;

public class Sale {
	int dateNumber;
	int month;
	int year;
	int day;
	double  amount ;
	
	Sale(int month,int year,int day,double amount){
		this.month = month;
		this.year = year;
		this.day = day;
		this.amount  =amount;
		setDateNumber();
	}
	void setDateNumber() {
		this.dateNumber = month+year+day;
	}
	void show() {
		System.out.println("Month  :"+ month);
		System.out.println("Year   :"+ year);
		System.out.println("Amount  :"+amount);
	}
	
}
