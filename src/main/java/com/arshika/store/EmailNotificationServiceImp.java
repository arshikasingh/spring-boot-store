package com.arshika.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EmailNotificationServiceImp implements NotificationService{
    @Override
   public void send(String message) {
       System.out.println("message through email");
       System.out.println("message " + message);
   }
}
