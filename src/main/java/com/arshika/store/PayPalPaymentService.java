package com.arshika.store;

public class PayPalPaymentService implements PaymentService{

    @Override
    public void paymentProcess(double amount) {
        //open closed  principal
        System.out.println("paypal");
        System.out.println("amount" + amount);
    }
}
