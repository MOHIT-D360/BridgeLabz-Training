package com.linkedlist.singlylinkedlist.schoolgradesystem;

public class LinkedListTest {
	 public static void main(String[] args) {
	        StudentLinkedList list = new StudentLinkedList();

	        list.addAtBeginning(1, "mohit", 21, 'A');
	        list.addAtEnd(2, "rohit", 20, 'B');
	        list.addAtPosition(2, 3, "kavir", 24, 'C');

	        list.displayStudents();
	        System.out.println("___________________________");

	        list.searchStudent(2);

	        list.updateGrade(3, 'A');

	        list.deleteByRollNumber(1);

	        list.displayStudents();
	    }
}
