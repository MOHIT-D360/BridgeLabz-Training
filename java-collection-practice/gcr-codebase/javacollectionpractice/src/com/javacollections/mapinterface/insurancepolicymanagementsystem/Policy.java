package com.javacollections.mapinterface.insurancepolicymanagementsystem;
import java.time.*;

public class Policy implements Comparable<Policy>{
	Integer policyNumber;
	public String policyHolderName;
	LocalDate expiryDate ;
	String coverageType;
	double premium;
	
	Policy(int policyNumber,String policyHolderName,LocalDate expiryDate,String coverageType,double premium){
		this.policyHolderName = policyHolderName;
		this.policyNumber = policyNumber;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premium = premium;
	}
	
	

	public int compareTo(Policy other) {
		return this.expiryDate.compareTo(other.expiryDate);
	}
	
	  public String toString() {
	        return policyNumber + " | " + policyHolderName + " | " +
	               expiryDate + " | " + coverageType + " | " + premium;
	    }
	
	
}
