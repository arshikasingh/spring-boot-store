package com.arshika.store;

import org.springframework.stereotype.Component;

//@Component- here we can also use service annotation - both work for bean configuration through annotation
public class OrderService {

    private PaymentService paymentService;//You're declaring a variable named paymentService that can hold an object of any class that implements PaymentService interface.
//the best way to inject dependency is through constructor by passing them as an argument
    //constructor
    public OrderService(PaymentService paymentService) {
        //now we want to store this on a variable so we can use it
        this.paymentService = paymentService;
    }
    //setter to inject dependency is the second way but below is not the setter
    public void placeOrder() {
       paymentService.paymentProcess(10);
    }
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
