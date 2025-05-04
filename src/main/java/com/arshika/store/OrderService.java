package com.arshika.store;

public class OrderService {
    private PaymentService paymentService;
//the best way to inject dependency is through constructor by passing them as an argument
    //constructor
    public OrderService(PaymentService paymentService) {
        //now we want to store this on a variable so we can use it
        this.paymentService = paymentService;
    }
    //setter to inject dependency
    public void placeOrder() {
       paymentService.paymentProcess(10);
    }
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
