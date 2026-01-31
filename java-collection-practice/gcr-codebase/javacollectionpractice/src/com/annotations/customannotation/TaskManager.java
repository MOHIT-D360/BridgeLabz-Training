package com.annotations.customannotation;

public class TaskManager {
 @TaskInfo(priority = "High", assignedTo = "Mohit")
 public void completeTask() {
	 System.out.println("Task is being completed...");
 }
}
