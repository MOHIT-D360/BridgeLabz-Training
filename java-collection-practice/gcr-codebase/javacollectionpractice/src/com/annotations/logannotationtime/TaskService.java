package com.annotations.logannotationtime;

public class TaskService {
	@LogExecutionTime
	public void fastTask() {
		for(int i=0;i<1000;i++) {
			
		}
	}
	
	
	@LogExecutionTime
	public void slowTask() {
		for(int i=0;i<1_000_000;i++) {
			
		}
	}
}
