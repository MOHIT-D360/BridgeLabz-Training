package com.javacollections.queueinterface;
import java.util.*;

public class ReverseAQueue {
	
	public static void reverseQueue(Queue<Integer> e) {
		if(e.isEmpty())	return;
		
		int x  = e.remove();
		reverseQueue(e);
		e.add(x);
	}
	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>(Arrays.asList(10,20,30));
		
		reverseQueue(q1);
		
		System.out.println(q1);
	}
}
