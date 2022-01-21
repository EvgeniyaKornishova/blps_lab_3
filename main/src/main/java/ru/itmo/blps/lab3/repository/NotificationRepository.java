package ru.itmo.blps.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.blps.lab3.data.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
