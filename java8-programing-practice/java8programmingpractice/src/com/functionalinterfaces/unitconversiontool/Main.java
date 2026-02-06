package com.functionalinterfaces.unitconversiontool;

public class Main {
	 public static void main(String[] args) {

	        double distanceKm = 10;
	        double weightKg = 5;

	        double miles = UnitConvertor.kmToMiles(distanceKm);
	        double lbs = UnitConvertor.kgToLbs(weightKg);

	        System.out.println(distanceKm + " km = " + miles + " miles");
	        System.out.println(weightKg + " kg = " + lbs + " lbs");
	    }
}
