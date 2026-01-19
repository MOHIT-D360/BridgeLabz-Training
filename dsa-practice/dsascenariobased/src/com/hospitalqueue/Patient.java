package com.hospitalqueue;

public class Patient {
	int age;
	String name;
	int criticality;
	String gender;
	
	Patient(int age , String name,int criticality,String gender){
		this.age = age;
		this.name = name;
		
		this.gender = gender;
		setCriticality(criticality);
	}
	
	void showPatient() {
		System.out.println("Name     :"+ name);
		System.out.println("gender   :"+ gender);
		System.out.println("age      :"+ age);
		System.out.println("Criticality :"+ criticality);
	}
	int getCriticality(){
		return criticality;
	}
	private void setCriticality(int criticality){
		if(age<=10 && age>=0)this.criticality = criticality;
		else System.out.println("wrong criticality input");
	}
	
}
