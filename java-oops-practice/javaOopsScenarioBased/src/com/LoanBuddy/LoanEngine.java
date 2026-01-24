package com.LoanBuddy;

public class LoanEngine {

    public void processLoan(LoanApplication loan) {

        loan.approveLoan();

        if (loan.getStatus() == LoanStatus.APPROVED) {
            System.out.println(" Loan Approved");
            System.out.println("EMI: " + loan.calculateEMI());
        } else {
            System.out.println(" Loan Rejected");
        }
    }
}
