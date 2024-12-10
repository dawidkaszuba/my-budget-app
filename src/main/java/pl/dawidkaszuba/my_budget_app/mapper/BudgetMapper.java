package pl.dawidkaszuba.my_budget_app.mapper;


import pl.dawidkaszuba.my_budget_app.model.Budget;

import java.time.LocalDateTime;

public interface BudgetMapper {

    Budget getBudgetByBudgetUserId(Long budgetUserId, LocalDateTime startDate, LocalDateTime endDate);
}
