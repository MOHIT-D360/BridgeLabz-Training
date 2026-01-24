package com.LoanBuddy;

public class AutoLoan extends LoanApplication {

    AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.0);
    }

    @Override
    public void approveLoan() {

        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 20000) {
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
