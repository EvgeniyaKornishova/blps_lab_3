package ru.itmo.blps.lab3.notificationSender;

import org.springframework.stereotype.Service;

@Service
public class CommunicationServiceStab implements CommunicationService{
    @Override
    public void sendNotificationToEmail(Notification notification){
    };

    @Override
    public void sendNotificationToBrowser(Notification notification){
    };

    @Override
    public void sendNotificationToMobile(Notification notification){
    };
}
