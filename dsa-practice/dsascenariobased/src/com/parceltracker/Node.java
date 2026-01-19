package com.parceltracker;

public class Node {
	String stageName;
	Parcel p;
	Node next;
	Node(String stageName){
		this.stageName = stageName;
		this.p = null;
		this.next  = null;
	}
	Node(Parcel p){
		this.p = p;
		this.next = null;
	}
}
