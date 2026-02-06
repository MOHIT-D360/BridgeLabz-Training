package com.streamsapi;
import java.util.*;
import java.util.stream.*;
public class IotReadingLogger {
public static void main(String[] args) {
	List<Double > readings = Arrays.asList(12.4,21.1,18.2,15.5,20.1,17.1,17.10);
	double threshold = 20.0;
	
	readings.stream()
	.filter(x-> x<threshold)
	.forEach(System.out::println);
}
}
