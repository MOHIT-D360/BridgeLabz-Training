package com.javacollections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Objects;

class Policy implements Comparable<Policy> {

    String policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    Policy(String policyNumber, String holderName,
           LocalDate expiryDate, String coverageType,
           double premiumAmount) {

        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // For uniqueness (Policy Number based)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    // For TreeSet (sort by expiry date)
    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}
