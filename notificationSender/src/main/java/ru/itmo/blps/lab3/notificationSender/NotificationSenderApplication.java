package ru.itmo.blps.lab3.notificationSender;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class NotificationSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationSenderApplication.class, args);
	}
}

