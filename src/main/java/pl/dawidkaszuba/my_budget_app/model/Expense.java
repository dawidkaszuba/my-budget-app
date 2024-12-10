package pl.dawidkaszuba.my_budget_app.model;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class Expense {
    private Long id;
    private BigDecimal value;
    private Long categoryId;
    private LocalDateTime creationDateTime;
    private Long accountId;
    private LocalDateTime changeTime;
    private Long changeAccountUserId;
    private LocalDateTime deleteTime;
}
