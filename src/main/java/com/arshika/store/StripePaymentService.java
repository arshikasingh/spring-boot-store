package com.arshika.store;

public class StripePaymentService implements PaymentService {

    @Override
    public void paymentProcess(double amount) {
        System.out.println("stripe");
        System.out.println("amount" + amount);
    }
}
