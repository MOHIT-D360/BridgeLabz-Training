package com.trafficmanager;

public class VehicleQueue {
	String[] queue;
	int front =0,rear = -1,size,capacity;
	
	VehicleQueue(int capacity){
		this.capacity = capacity;
		queue = new String[capacity];
	}
	
	boolean isFull() {
		return size == capacity;
	}
	boolean isEmpty() {
		return size ==0;
	}
	void enqueue(String car) {
		if(isFull()) {
			System.out.println("Queue full");
			return ;
		}
		
		rear = (rear+1) % capacity;
		queue[rear] = car;
		size++;
		System.out.println(car + " added");
	}
	String dequeue() {
		if(isEmpty()) {
			System.out.println("already empty");
			return null;
		}
		String veh = queue[front];
		front = (front +1) % capacity;
		size--;
		return veh;
		
	}
}
