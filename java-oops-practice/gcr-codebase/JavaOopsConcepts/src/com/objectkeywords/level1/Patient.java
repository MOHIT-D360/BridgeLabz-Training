package com.objectkeywords.level1;

public class Patient {
	private static String hospitalName;
	private static int totalPatients =0;
	
	private final String patientId;
	private String name;
	private int age;
	private String ailment;
	
	public Patient(String name,int age,String ailment,String patientId) {
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientId = patientId;
		totalPatients++;
	}
	public static void setHospitalName(String name) {
		hospitalName = name;
	}
	public static int getTotalPatients() {
			return totalPatients;
	}
	public void displayPatientDetails() {
	       if (this instanceof Patient) {
	           System.out.println("Hospital Name: " + hospitalName);
	           System.out.println("Patient ID: " + patientId);
	           System.out.println("Name: " + name);
	           System.out.println("Age: " + age);
	           System.out.println("Ailment: " + ailment);
	       } else {
	           System.out.println("The object is not an instance of the Patient class.");
	       }
}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAilment() {
		return ailment;
	}
	public String getPatientId() {
		return patientId;
	}
	
	public static void main(String[] args) {
		Patient.setHospitalName("Wockheart hospital");
		
		Patient p1 = new Patient("Arue",30,"Flu","p001");
		Patient p2 = new Patient("Rohit",24,"Cold","p002");
		
		System.out.println("Total patients admitted :"+ Patient.getTotalPatients());
		
		p1.displayPatientDetails();
		p2.displayPatientDetails();
		

	}

}
