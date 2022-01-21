package ru.itmo.blps.lab3.service;

import org.springframework.stereotype.Service;
import ru.itmo.blps.lab3.data.Equity;
import ru.itmo.blps.lab3.data.NotificationRule;
import ru.itmo.blps.lab3.data.User;
import ru.itmo.blps.lab3.data.dto.NotificationRuleInDto;
import ru.itmo.blps.lab3.repository.NotificationRuleRepository;

@Service
public class NotificationService {
    private final NotificationRuleRepository notificationRuleRepository;

    public NotificationService(NotificationRuleRepository notificationRuleRepository) {
        this.notificationRuleRepository = notificationRuleRepository;
    }

    public NotificationRule createNotificationRule(NotificationRuleInDto notificationRuleInDto, Equity equity, User user) {
        NotificationRule notificationRule = new NotificationRule();
        notificationRule.setUser(user);
        notificationRule.setEquity(equity);
        notificationRule.setOnce(notificationRuleInDto.getOnce());
        notificationRule.setOp(notificationRuleInDto.getOp());
        notificationRule.setValue(notificationRuleInDto.getValue());
        return notificationRuleRepository.save(notificationRule);
    }
}
