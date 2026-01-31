package com.annotations.customannotation;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			TaskManager manager = new TaskManager();
			
			Method method = manager.getClass().getMethod("completeTask");
			
			TaskInfo taskinfo= method.getAnnotation(TaskInfo.class);
			
			System.out.println("Priority : "+ taskinfo.priority());
			System.out.println("Assigned To : "+ taskinfo.assignedTo());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
