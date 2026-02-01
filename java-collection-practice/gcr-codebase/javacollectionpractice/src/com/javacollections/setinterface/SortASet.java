package com.javacollections.setinterface;
import java.util.*;

public class SortASet {
  public static void main(String[] args) {
	// sort set -> ascending order
	  Set<Integer> set1 = new HashSet<>(Arrays.asList(5,3,9,1));
	  
	  // method1 
	  SortedSet<Integer> sortedSet = new TreeSet<>(set1);
	  System.out.println(sortedSet);
	  
	  
}
}
