package com.arshika.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //note: we can configure the beans in spring in tgwo ways
    //1- using annotations - @Service
    //2- using own method with @Bean annotation here we made own means this method is more helpful when
    //a- give us more control
    //b- configuring beans for third party api
    //add methods for creating beans
    @Value("${order.payment-method}")
    private String paymentMethod;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService payPal() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        if(paymentMethod.equals("stripe")) {
            return new OrderService(stripe());
        }
        else {
            return new OrderService(payPal());
        }
    }



}
