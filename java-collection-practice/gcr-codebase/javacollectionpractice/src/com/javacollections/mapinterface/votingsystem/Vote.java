package com.javacollections.mapinterface.votingsystem;



public class Vote  implements Comparable<Vote>{
	String candidate ;
	int votes;
	
	Vote(String candidate,int votes){
		this.candidate = candidate;
		this.votes = votes;
		
	}
	
	public String toString() {
		return " ("+candidate + ")";
	}
	
   public int compareTo(Vote other) {
	   return Integer.compare(other.votes, this.votes);
	    }
}
