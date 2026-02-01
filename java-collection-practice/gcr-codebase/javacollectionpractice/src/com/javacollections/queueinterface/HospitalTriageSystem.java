package com.javacollections.queueinterface;
import java.util.*;

class Patient implements Comparable<Patient>{
	String name;
	int severity;
	Patient(String name,int severity){
		this.name = name;
		this.severity  = severity;
	}
	
	public int compareTo(Patient other) {
		return other.severity - this.severity;
	}
	
	public String toString() {
		return name + " " + severity;
	}
}

public class HospitalTriageSystem {
	
	public static void main(String[] args) {
		PriorityQueue<Patient> q = new PriorityQueue<>();
		q.add(new Patient("John",3));
		q.add(new Patient("Alice",5));
		q.add(new Patient("Bob",2));
		
		System.out.println(q);
		
	}
}
