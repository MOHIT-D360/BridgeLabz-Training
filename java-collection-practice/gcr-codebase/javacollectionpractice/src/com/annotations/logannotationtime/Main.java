package com.annotations.logannotationtime;
import java.lang.reflect.Method;
public class Main {
	public static void main(String[] args) throws Exception{
		TaskService service = new TaskService();
		Method[] method = service.getClass().getDeclaredMethods();
		
		for(Method m : method) {
			if(m.isAnnotationPresent(LogExecutionTime.class)) {
				long startTime = System.nanoTime();
				m.invoke(service);
				long endTime = System.nanoTime();
				
				long time = endTime  - startTime;
				
				System.out.println(m.getName() + " Executed in " + time + " nanoseconds");
			}
		}
	}
}
