package com.LoanBuddy;

abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;               
    protected double interestRate;   
    protected LoanStatus status;

    LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.status = LoanStatus.PENDING;
    }

  
    protected void approve() {
        status = LoanStatus.APPROVED;
    }

    protected void reject() {
        status = LoanStatus.REJECTED;
    }

    public LoanStatus getStatus() {
        return status;
    }


    protected double calculateEMIInternal(double principal,
                                          double monthlyRate,
                                          int months) {

        return (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}
