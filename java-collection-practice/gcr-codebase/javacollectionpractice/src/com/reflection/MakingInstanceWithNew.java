package com.reflection;
import java.lang.reflect.Constructor;

class Student {
	private String name;
	private int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name :"+ name + ", Age :"+ age);
	}
}

public class MakingInstanceWithNew {
	public static void main(String[] args) {
		
		try {
			
			Class <?> cls = Class.forName("com.reflection.Student");
			
			Constructor<?> cons = cls.getConstructor(String.class,int.class);
			
			Object obj = cons.newInstance("Mohit",21);
			
			Student stu = (Student) obj;
			stu.display();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
