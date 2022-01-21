package ru.itmo.blps.lab3.notificationSender;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;

    private String username;
    private String password;
    private Long violationsCount;
}
