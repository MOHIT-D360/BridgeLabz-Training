package com.ambulanceroute;

public class AmbulanceRouteApp {
	
	public static void main(String [] args) {
		
		HospitalUnit cityHospital = new HospitalUnit();
		
		Patient p1 = new Patient("Mohit",21,"male");
		Patient p2 = new Patient("Rohit",20,"male");
		Patient p3 = new Patient("Rohan",19,"male");
		Patient p4 = new Patient("Sohan",18,"male");
		Patient p5 = new Patient("Guru",17,"male");
		
		cityHospital.show();
		System.out.println("______________________");
		
		cityHospital.putPatient(p1);
		cityHospital.putPatient(p2);
		cityHospital.putPatient(p3);
		cityHospital.putPatient(p4);
		
		cityHospital.remove();
		cityHospital.putPatient(p5);
		
		System.out.println("______________________");
		
		cityHospital.show();
		
		cityHospital.remove();
		cityHospital.remove();
		cityHospital.remove();
		cityHospital.remove();
		cityHospital.remove();
		cityHospital.remove();
		System.out.println("______________________");
		cityHospital.show();
		
		
	}
}
