package com.parceltracker;

public class Stages {
	Node head;
	Node parcelTracker;
	Node packed = new Node("packed");
	Node Shipped = new Node("shipped");
	Node inTransmit = new Node("in-transmit");
	Node delivered = new Node("delivered");
	Stages(){
		
		head = packed;
		parcelTracker = head;
		head.next = Shipped;
		head.next.next=inTransmit;
		head.next.next.next= delivered;
	}
	void add(Parcel p) {
		head.p = p;
		
	}
	void status() {
		System.out.println("Your Parcel is in "+ parcelTracker.stageName+ " stage ");
	}
	void next() {
		
		Node tempNode = parcelTracker;
		tempNode.p = parcelTracker.p;
		parcelTracker.p = null;
		parcelTracker = parcelTracker.next;
		parcelTracker.p = tempNode.p;
	}
	void makeCheckPoint(String name,int index) {
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		Node nn = new Node(name);
		Node custome = temp.next.next; 
		temp.next = nn;
		nn.next = custome;
				
	}
}
