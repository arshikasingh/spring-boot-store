package com.arshika.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class SMSNotificationServiceImp implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("message through sms");
        System.out.println("message" + message);
    }

}
