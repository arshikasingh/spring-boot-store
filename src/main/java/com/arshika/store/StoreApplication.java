package com.arshika.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var manager = context.getBean(OrderService.class);
		manager.placeOrder();
		//sedond way to inject dependency isthrough setters
//		var orderService = new OrderService(new PayPalPaymentService());
//		orderService.placeOrder();
//
//		var notificationServiceObj = new NotificationManager(new EmailNotificationServiceImp());
//		notificationServiceObj.notifMessage();
	}


}
