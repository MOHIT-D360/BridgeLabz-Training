package com.LoanBuddy;

public class HomeLoan extends LoanApplication {

    HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    @Override
    public void approveLoan() {

        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 30000) {
            approve();
        } else {
            reject();
        }
    }

    @Override
    public double calculateEMI() {

        if (status != LoanStatus.APPROVED) return 0;

        double monthlyRate = (interestRate / 12) / 100;
        return calculateEMIInternal(
                applicant.getLoanAmount(),
                monthlyRate,
                term
        );
    }
}
