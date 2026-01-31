package com.annotations.suppresswarnings;
import java.util.*;

@SuppressWarnings("unchecked")
public class SupressWarnings {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Mohit");
		l.add(21);
		
		for(Object o : l) {
			System.out.println(o);
		}

	}
}
