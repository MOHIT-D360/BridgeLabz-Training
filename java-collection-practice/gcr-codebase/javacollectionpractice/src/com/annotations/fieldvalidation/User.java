package com.annotations.fieldvalidation;
import java.lang.reflect.Field;

public class User {
	@MaxLength(10)
	private String username;
	
	public User(String username) {
		try {
			Field field = this.getClass().getDeclaredField("username");
			
			MaxLength maxlength = field.getAnnotation(MaxLength.class);
			if(maxlength != null && username.length()> maxlength.value()) {
				throw new IllegalArgumentException("Username must be less than :"+ maxlength.value());
			}
			this.username = username;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
