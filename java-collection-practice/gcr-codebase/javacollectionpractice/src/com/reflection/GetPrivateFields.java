package com.reflection;
import java.lang.reflect.Field;

class Person{
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
}

public class GetPrivateFields {
	public static void main(String[] args) {
		try {
			Person p = new Person(25);
			Class<?> cls = p.getClass();
			
			
			Field field = cls.getDeclaredField("age");
			
			field.setAccessible(true);
			
			int originalAge = field.getInt(p);
			System.out.println("Original Age :"+ originalAge);
			
			field.setInt(p, 40);
			
			int updateAge = field.getInt(p);
			System.out.println("Updated age :"+ updateAge);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
