package ru.itmo.blps.lab3.notificationSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class Receiver {
    @Autowired
    CommunicationService communicationService;

    @JmsListener(destination = "emailNotificationQueue", containerFactory = "jmsListenerContainerFactory")
    public void receiveEmailNotification(byte[] notificationMessage) {
        String stringNotification = new String(notificationMessage);
        System.out.println("Received email   <" + stringNotification + ">");

        Notification notification = Notification.fromString(stringNotification);
        communicationService.sendNotificationToEmail(notification);
    }

    @JmsListener(destination = "browserNotificationQueue", containerFactory = "jmsListenerContainerFactory")
    public void receiveBrowserNotification(byte[] notificationMessage) {
        String stringNotification = new String(notificationMessage);
        System.out.println("Received browser <" + stringNotification + ">");

        Notification notification = Notification.fromString(stringNotification);
        communicationService.sendNotificationToBrowser(notification);
    }

    @JmsListener(destination = "mobileNotificationQueue", containerFactory = "jmsListenerContainerFactory")
    public void receiveMobileNotification(byte[] notificationMessage) {
        String stringNotification = new String(notificationMessage);
        System.out.println("Received mobile  <" + stringNotification + ">");

        Notification notification = Notification.fromString(stringNotification);
        communicationService.sendNotificationToMobile(notification);
    }

}