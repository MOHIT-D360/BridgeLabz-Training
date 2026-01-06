package com.linkedlist.circularlinkedlist.taskscheduler;

public class TestLinkedList {
	
	 public static void main(String[] args) {
	        TaskScheduler scheduler = new TaskScheduler();

	        scheduler.addAtBeginning(1, "Task 1", 1, "1-1-2026");
	        scheduler.addAtEnd(2, "Task 2", 2, "2-1-2026");
	        scheduler.addAtEnd(3, "Task 3", 3, "3-1-2026");
	        
	        scheduler.addAtPosition(2, 4, "Task 4", 4, "4-1-2026");

	        scheduler.displayTasks();

	        scheduler.viewCurrentAndMoveNext();

	        scheduler.displayTasks();

	        scheduler.searchByPriority(1);

	        scheduler.removeByTaskId(2);

	        scheduler.displayTasks();
	    }

}
