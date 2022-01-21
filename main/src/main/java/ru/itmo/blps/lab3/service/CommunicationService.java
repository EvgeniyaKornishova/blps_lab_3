package ru.itmo.blps.lab3.service;

import ru.itmo.blps.lab3.data.Notification;

public interface CommunicationService {
    void sendNotificationToEmail(Notification notification);
    void sendNotificationToBrowser(Notification notification);
    void sendNotificationToMobile(Notification notification);
}

