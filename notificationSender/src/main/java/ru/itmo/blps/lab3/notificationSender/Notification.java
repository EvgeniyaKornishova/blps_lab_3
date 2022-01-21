package ru.itmo.blps.lab3.notificationSender;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class Notification {
    private String message;

    private LocalDateTime time;

    private Long userId;

    public static Notification fromString(String stringNotification){
        Notification notification = new Notification();

        List<String> groups = List.of(stringNotification.split("\\|"));

        notification.setMessage(groups.get(0));
        notification.setTime(LocalDateTime.parse(groups.get(1)));
        notification.setUserId(Long.parseLong(groups.get(2)));

        return notification;
    }
}
