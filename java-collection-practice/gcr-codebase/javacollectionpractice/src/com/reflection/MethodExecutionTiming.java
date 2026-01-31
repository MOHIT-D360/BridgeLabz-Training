package com.reflection;
import java.lang.reflect.*;
class Task{
	public void fastTask() {
		for(int i=0;i<1_000;i++) {
			
		}
	}
	
	public void slowTask() {
		  for (int i = 0; i < 1_000_000; i++) {

	        }
	}
}

public class MethodExecutionTiming {
	public static void main(String[] args) {
		try {
			Task task = new Task();
			Class<?> cls = task.getClass();
			
			Method[] methods = cls.getDeclaredMethods();
			for(Method method : methods) {
				if(method.getParameterCount() ==0) {
					long startTime = System.nanoTime();
					method.invoke(task);
					long endTime = System.nanoTime();
					
					long result  = endTime = startTime;
					System.out.println(method.getName() + " executed in " + result + " nanosecond");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
