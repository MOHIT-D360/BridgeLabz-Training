package com.exceptions.throwvsthrows;

public class ExceptionPropogation {
	public static double calculateIntrest(double amount,double rate,int years)  {
		if(amount<0 || rate<0) {
			throw new IllegalArgumentException("Enter valid amount or rate");
		}
		else {
			
			return (amount*rate*years)/100;
		}
	}
	public static void main(String[] args) {
		double amount =-200;
		double rate = 3 ;
		int years =12;
		try {
			
			double result = calculateIntrest(amount,rate,years);
			System.out.println(result);
		}
		catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
		
	}
}
