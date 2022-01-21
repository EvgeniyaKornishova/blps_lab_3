package ru.itmo.blps.lab3.data.dto;

import lombok.Data;
import ru.itmo.blps.lab3.data.CompareOperator;

@Data
public class NotificationRuleInDto {
    private Boolean once;

    private Double value;

    private CompareOperator op;
}
