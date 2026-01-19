package com.hospitalqueue;

public class HospitalQueueApp {
	public static void main(String [] args) {
		Patient[] p1 = new Patient[5];
		p1[0] = new Patient(21,"Mohit",3,"Male");
		p1[1] = new Patient(20,"Roshni",1,"Female");
		p1[2] = new Patient(19,"abhay",2,"male");
		p1[3] = new Patient(22,"radha",9,"Female");
		p1[4] = new Patient(23,"Tarun",5,"male");
		
		Sort s = new Sort(p1);
		
		for(int i=0;i<p1.length;i++) {
			p1[i].showPatient();
			
			System.out.println("------------------------");
		}
		
	}
}
