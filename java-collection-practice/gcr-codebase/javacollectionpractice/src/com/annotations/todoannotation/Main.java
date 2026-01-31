package com.annotations.todoannotation;
import java.lang.reflect.Method;





public class Main {
	
	public static void main(String[] args) {
		TaskManager tm = new TaskManager();
		try {
			Method[] method = tm.getClass().getDeclaredMethods();
			
			
			for(Method m : method) {
				if(m.isAnnotationPresent(Todo.class)) {
					Todo im = m.getAnnotation(Todo.class);
					
					System.out.println(im.assignedTo());
					System.out.println(im.task());
					System.out.println(im.priority());
					System.out.println("--------------------");
				
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
