package com.arshika.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.arshika.store.entities.User;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var manager = context.getBean(OrderService.class);
//		manager.placeOrder();
		//sedond way to inject dependency isthrough setters
//		var orderService = new OrderService(new PayPalPaymentService());
//		orderService.placeOrder();
//
//		var notificationServiceObj = new NotificationManager(new EmailNotificationServiceImp());
//		notificationServiceObj.notifMessage();

		//before builder how we will create user object

//		var user = new User(1L, "name", "email", "password");
//        user.setName("john");
//		user.setEmail("john@gmail.com");
//		user.setPassword("password");

		//after builder now we create object lilke this
		//builder method will return the user object

		var user = User.builder()
				.name("john")
				.email("john@gmail.com")
				.password("password")
				.build();//this willreturn the user object


	}


}
