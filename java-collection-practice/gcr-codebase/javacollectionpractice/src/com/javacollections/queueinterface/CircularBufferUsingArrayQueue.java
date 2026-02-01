package com.javacollections.queueinterface;
import java.util.*;

 class BufferDeque{
	 Deque<Integer> q1 ;
	 int capacity;
	 BufferDeque(int capacity){
		 this.capacity = capacity;
		 q1= new ArrayDeque<>(capacity);
	 }
	 
	 public void insert(int x) {
		 if(q1.size() == capacity) {
			 q1.poll();
		 }
		 q1.offer(x);
	 }
	 public void display() {
		 System.out.println(q1);
	 }
 }

public class CircularBufferUsingArrayQueue {
 public static void main(String[] args) {
	BufferDeque buffer = new BufferDeque(3);
	buffer.insert(1);
	buffer.insert(2);
	buffer.insert(3);
	
	buffer.display();
	
	buffer.insert(4);
	buffer.display();
}
}
