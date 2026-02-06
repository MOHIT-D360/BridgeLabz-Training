package com.functionalinterfaces.paymentgatewayintegration;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor p1 = new UPIProcessor();
        PaymentProcessor p2 = new CardProcessor();

        p1.pay(500);
        p1.refund(200);

        p2.pay(1000);
        p2.refund(300);
    }
}
