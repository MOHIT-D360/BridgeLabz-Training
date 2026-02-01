package com.javacollections.queueinterface;
import java.util.*;

public class GenerateBinary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		Queue<String> q = new ArrayDeque<>();
		for(int i=0;i<=n;i++) {
			String binary = Integer.toBinaryString(i);
			q.add(binary);
		}
		System.out.println(q);
	}
}
