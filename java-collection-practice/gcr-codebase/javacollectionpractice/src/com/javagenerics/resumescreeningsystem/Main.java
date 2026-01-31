package com.javagenerics.resumescreeningsystem;

public class Main {
	public static void main(String[] args) {
		Resume<SoftwareEngineer> resume1 = new Resume<>("Applicant1", new SoftwareEngineer());
		System.out.println(resume1);
		
		Resume<DataScientist> resume2 = new Resume<>("Applicant2", new DataScientist());
		System.out.println(resume2);
		
		Resume<ProductManager> resume3 = new Resume<>("Applicant3", new ProductManager());
		System.out.println(resume3);
	}
}
