package com.streamsapi;
import java.util.*;
import java.util.stream.*;

class Doctor{
	String name;
	boolean isAvailableOnWeekend;
	String specialty;
	Doctor(String name,boolean isAvailableOnWeekend,String specialty){
		this.name = name;
		this.isAvailableOnWeekend = isAvailableOnWeekend;
		this.specialty = specialty;
	}
	public String toString() {
		return name + " " + specialty;
	}
}

public class DoctorAvailabilityChecker {
	public static void main(String[] args) {
		List<Doctor> list = new ArrayList<>();
		list.add(new Doctor("doc1",true,"Cardiologist"));
		list.add(new Doctor("doc2",false,"Sergion"));
		list.add(new Doctor("doc3",true,"Neurosergion"));
		list.add(new Doctor("doc4",false,"Dermatologist"));
		list.add(new Doctor("doc5",true,"Nephrology"));
		
		list.stream()
		.filter(m -> m.isAvailableOnWeekend)
		.sorted((m1,m2)-> m2.specialty.compareTo(m1.specialty))
		.forEach(System.out::println);
	}
}
