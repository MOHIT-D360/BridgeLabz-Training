package com.FoodLoop;

public class Order implements IOrderable{
	private FoodItem[] fi = new FoodItem[100];
	private double total ;
	private double discount;
	
	private int count =0;
	Order(FoodItem[] f){
		fi = f;
		
	}
	
	public void placeOrder() {
		int i=0;
		while(i < 6) {
			total+= fi[i].getPrice();
			
			fi[i].availability = false;
			i++;
		}
		count = i;
		System.out.println("Your order is placed and total bill is "+ getbill());
	}
	
	private double getbill() {
		if(total>500) {
			double discount = total* 0.2;
			return (total-discount);
		}
		else {
			
			return total;
		}
	}
	public void cancelOrder() {
		this.total =0;
		this.count =0;
		this.fi =null;
	}
	public void getDetails() {
		
		for(int j=0;j<6;j++) {
			fi[j].getDetails();
		}
	}
}
