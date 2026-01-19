package com.trafficmanager;

public class TrafficManagerApp {
 public static void main(String [] args) {
	 Roundabout roundabout = new Roundabout();
	 VehicleQueue queue = new VehicleQueue(3);
	 
	 roundabout.addCar("Car-101");
	 roundabout.addCar("Car-102");
	 roundabout.addCar("Car-103");
	 roundabout.addCar("Car-104");
	 
	 roundabout.display();
	 
	 queue.enqueue("car1");
	 queue.enqueue("car2");
	 queue.enqueue("car3");
	 queue.enqueue("car4");
	 
	 roundabout.removeCar();
	 roundabout.display();
	 
	 String nextCar = queue.dequeue();
	 if(nextCar != null) {
		 roundabout.addCar(nextCar);
	 }
	 
	 roundabout.display();
 }
}
