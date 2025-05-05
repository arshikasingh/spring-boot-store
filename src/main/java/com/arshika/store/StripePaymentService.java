package com.arshika.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")//if we have two class which implementing same interface so at the time of bean creation the spring bott enabled to understand
//for which class we have to make bean so there are 3 ways to make beans
//1- use primary annotation - set default class
//2-using qualifier annotation like @Qualifier("stripePaymentService") - this is the bean name of StripePaymentService class
//by defauklkt spring boot create bean by lowercase of first letter
//3- given customname to service like - @Service("stripe") - and use this by qualifier annotation where you inject thios bean
//like - @Autowired
//@Qualifier("stripe")
//private PaymentService paymentService;
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeOut:3000}")//initialized with default value if not written in app properties if written there override
    private int timeOut;

    @Override
    public void paymentProcess(double amount) {
        System.out.println("stripe");
        System.out.println("apiUrl" + apiUrl + "enabled" + enabled);
        System.out.println("amount" + amount);
    }
}
