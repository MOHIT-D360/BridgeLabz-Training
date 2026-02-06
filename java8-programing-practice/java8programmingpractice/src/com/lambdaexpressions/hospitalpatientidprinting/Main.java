package com.lambdaexpressions.hospitalpatientidprinting;
import java.util.*;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Patient> patients = new ArrayList<>();
		patients.add(new Patient(100,"mohit"));
		patients.add(new Patient(101,"rohit"));
		patients.add(new Patient(102,"vivek"));
		
		
		Consumer<Patient> p = System.out::println;
		for(Patient ps :patients) {
			p.accept(ps);
		}
	}
}
