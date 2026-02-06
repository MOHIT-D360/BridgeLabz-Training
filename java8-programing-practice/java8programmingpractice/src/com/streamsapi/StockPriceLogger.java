package com.streamsapi;
import java.util.List;
import java.util.Arrays;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Double> prices
		= Arrays.asList(101.5,102.3,99.8,105.0);
		
		prices.stream()
		.forEach(System.out::println);
	}
}
