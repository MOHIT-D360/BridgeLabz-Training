package com.javacollections.listinterface;

import java.util.Arrays;
import java.util.*;

public class RotateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to rotate :");
		int rotatingPosition = sc.nextInt();
		try {
			for (int i = 0; i < rotatingPosition; i++) {
				int lastIndex = list.size() - 1;
				int temp = list.get(0);
				for (int j = 0; j < list.size()-1; j++) {
					
					list.set(j, list.get(j + 1));
				}
				list.set(lastIndex, temp);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println(list);



	}
}
