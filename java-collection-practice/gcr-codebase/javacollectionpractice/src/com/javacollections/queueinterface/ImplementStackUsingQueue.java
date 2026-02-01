package com.javacollections.queueinterface;
import java.util.*;
 
 class StackUsingQueue{
	 Queue<Integer> q1 = new LinkedList<>();
	 Queue<Integer> q2 = new LinkedList<>();
	 
	 public void push (int x) {
		q2.add(x);
		
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	 }
	 
	 // q1 became stack
	 public int pop() {
		 if(q1.isEmpty()) {
			 throw new RuntimeException("Stack is empty");
		 }
		 int temp = q1.remove();
		 return temp;
	 }
	 public boolean isEmpty() {
		 return q1.isEmpty();
	 }
	 public int top() {
		 if(q1.isEmpty()) {
			 throw new RuntimeException("Stack is empty");
		 }
		 return q1.peek();
	 }
	 
 }

public class ImplementStackUsingQueue {
	public static void main(String[] args) {
			StackUsingQueue n = new StackUsingQueue();
			n.push(1);
			n.push(2);
			n.push(3);
	
			System.out.println(n.pop());
	}	
}
