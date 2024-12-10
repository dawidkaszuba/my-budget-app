package pl.dawidkaszuba.my_budget_app.service;

import pl.dawidkaszuba.my_budget_app.model.Budget;

import java.time.LocalDateTime;


public interface BudgetService {
    Budget getBudgetByBudgetUserId(Long budgetUserId, LocalDateTime startDate, LocalDateTime endDate);
}
