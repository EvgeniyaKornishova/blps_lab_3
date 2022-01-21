package ru.itmo.blps.lab3.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itmo.blps.lab3.data.Notification;


@Service
public class CommunicationServiceMQ implements CommunicationService{

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void sendNotificationToEmail(Notification notification){
        sendNotificationToQueue("emailNotificationQueue", notification);
    };

    @Override
    public void sendNotificationToBrowser(Notification notification){
        sendNotificationToQueue("browserNotificationQueue", notification);
    };

    @Override
    public void sendNotificationToMobile(Notification notification){
        sendNotificationToQueue("mobileNotificationQueue", notification);
    };

    public void sendNotificationToQueue(String queueName, Notification notification) {
        rabbitTemplate.convertAndSend(queueName, notification.toString());
    }
}
