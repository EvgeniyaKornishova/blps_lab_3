package ru.itmo.blps.lab3.notificationSender;

public interface CommunicationService {
    void sendNotificationToEmail(Notification notification);
    void sendNotificationToBrowser(Notification notification);
    void sendNotificationToMobile(Notification notification);
}

