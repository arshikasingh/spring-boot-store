package com.arshika.store;

import org.springframework.stereotype.Component;

@Component//this annotation help to create an object of this class and manage it for me so spring boot inject these class wherever it will needed like controler, service
public class NotificationManager {
    private NotificationService notificationService;
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifMessage(String message) {
        notificationService.send(message);
    }
}
