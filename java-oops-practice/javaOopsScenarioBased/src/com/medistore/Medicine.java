package com.medistore;
import java.time.LocalDate;

public abstract  class Medicine  implements ISellable{
	protected  String name;
	protected  Double price;
	protected LocalDate date;
	private int quantity;
	
	
	private static double  totalCost =0;
	
	Medicine(String name,Double price,LocalDate date,int quantity){
		this.name = name;
		this.price = price ;
		this.date = date;
		this.quantity = quantity;	
	
	}
	Medicine(String name,Double price,LocalDate date){
		this.name = name;
		this.price = price ;
		this.date = date;
		this.quantity = 5;			
	}
	
	 protected boolean reduceStock(int qty) {
	        if (qty <= quantity) {
	            quantity -= qty;
	            return true;
	        }
	        return false;
	    }
	public int getQuantity() {
		return quantity;
	}
	public String getName (){
		return name;
	}
	public LocalDate getExpDate(){
		return date;
	}
	public double getPrice() {
		return price;
	}
//	@Override
//	public void  sell(int units) {
//		if(quantity>= units) {
//			quantity = quantity -units;
//			System.out.println("successfully ");
//		}
//	}
	
	protected void calculateCost(int qty,double discountRate) {
		double total = price*qty;
		double discount = total*discountRate;
		totalCost = total - discount;
		
		System.out.println("Total Price after discount: " + totalCost);
	}
	
	 public abstract void printDetails();
	
}
