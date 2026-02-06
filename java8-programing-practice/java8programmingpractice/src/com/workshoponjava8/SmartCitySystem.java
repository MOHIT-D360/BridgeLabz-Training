package com.workshoponjava8;
import java.util.stream.*;
import java.util.*;
public class SmartCitySystem {
	public static void main(String[] args) {
		List<TransportService> services = List.of(
				new BusService(),
				new MetroService(),
				new TaxiService(),
				new AmbulanceService()
				);
		
		System.out.println("------------- Available Service ------------------");
		services.stream()
		.filter(s->s.getFare()<=100)
		.sorted((a,b)-> Double.compare(a.getFare(), b.getFare()))
		.forEach(TransportService::printServiceDetails);
		
		   System.out.println("\n--- Emergency Services ---");
	        services.stream()
	                .filter(s -> s instanceof EmergencyService)
	                .forEach(s -> System.out.println(s.getServiceName() + " gets priority"));

	        FareCalculator taxiFare = d -> d * 12;
	        System.out.println("\nTaxi Fare for 10 km: " + taxiFare.calculateFare(10));
	        
	        double distance = GeoUtils.calculateDistance(2, 3, 6, 7);
	        System.out.println("Calculated Distance: " + distance);
	        
	        List<Passenger> passengers = List.of(
	                new Passenger("A", "A-B", 20, true),
	                new Passenger("B", "A-B", 20, false),
	                new Passenger("C", "A-C", 30, true),
	                new Passenger("D", "B-C", 100, true),
	                new Passenger("E", "B-C", 100, false)
	            );
	        
	     // ----------------  groupingBy ----------------
	        System.out.println("\n--- Passengers Grouped by Route ---");
	        Map<String, List<Passenger>> byRoute =
	                passengers.stream()
	                          .collect(Collectors.groupingBy(Passenger::getRoute));
	        byRoute.forEach((k, v) ->
	                System.out.println(k + " -> " + v.size() + " passengers"));

	        
	        // ----------------  partitioningBy ----------------
	        System.out.println("\n--- Peak vs Non-Peak Trips ---");
	        Map<Boolean, List<Passenger>> peakSplit =
	                passengers.stream()
	                          .collect(Collectors.partitioningBy(Passenger::isPeakTime));
	        peakSplit.forEach((k, v) ->
	                System.out.println(k + " -> " + v.size())); 
	        
	        
	        System.out.println("\n--- Revenue Summary ----");
	        DoubleSummaryStatistics statics = 
	        		passengers.stream()
	        		.collect(Collectors.summarizingDouble(Passenger::getFarePaid));
	        
	        System.out.println("Total Revenue :"+ statics.getSum());
	        System.out.println("Average Fare:"+ statics.getAverage());
	        System.out.println("Max Fare :"+ statics.getMax());
	        System.out.println("Min Fare:"+ statics.getMin());
	        
	        // -------------- logging---------------
	        System.out.println( "\n --- Live DashBoard ---");
	        services.forEach(s-> System.out.println("Live :"+ s.getServiceName() + " running"));
	}
}
