package com.functionalinterfaces.temperaturealertsystem;
import java.util.Scanner;
import java.util.function.*;
public class TemperatureAlertApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperature = sc.nextDouble();
		
		final double limit = 43.5;
		
		Predicate<Double> p = x ->(x>limit);
		
		if(p.test(temperature)) {
			System.out.println("out of limit");
		}
		else {
			System.out.println("In the limit");
		}
	}
}
