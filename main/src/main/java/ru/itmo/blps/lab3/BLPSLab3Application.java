package ru.itmo.blps.lab3;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BLPSLab3Application {
	public static void main(String[] args) {
		SpringApplication.run(BLPSLab3Application.class, args);
	}

	@Bean
	public Queue emailNotificationQueue(){
		return new Queue("emailNotificationQueue", false);
	}

	@Bean
	public Queue browserNotificationQueue(){
		return new Queue("browserNotificationQueue", false);
	}

	@Bean
	public Queue mobileNotificationQueue(){
		return new Queue("mobileNotificationQueue", false);
	}
}
