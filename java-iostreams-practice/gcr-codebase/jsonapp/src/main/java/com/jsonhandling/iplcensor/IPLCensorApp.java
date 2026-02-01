package com.jsonhandling.iplcensor;

public class IPLCensorApp {
	public static void main(String[] args) {
		System.out.println("going");
		try {
			JsonProcessor.processJson("IPL.json", "outputIpl.json");
			CsvProcessor.processCsv("IPL.csv", "outputIpl.csv");
			System.out.println("Successfull !");
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("ending");
	}
}
