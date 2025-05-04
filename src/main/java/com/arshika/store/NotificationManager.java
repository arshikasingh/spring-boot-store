package com.arshika.store;

public class NotificationManager {
    private NotificationService notificationService;
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifMessage() {
        notificationService.send("sending notifications");
    }
}
