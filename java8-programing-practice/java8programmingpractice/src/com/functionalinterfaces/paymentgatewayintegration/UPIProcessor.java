package com.functionalinterfaces.paymentgatewayintegration;

class UPIProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
