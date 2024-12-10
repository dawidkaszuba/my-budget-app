package pl.dawidkaszuba.my_budget_app.service;

import pl.dawidkaszuba.my_budget_app.model.Expense;

import java.time.LocalDateTime;
import java.util.List;


public interface ExpenseService {
    List<Expense> findAllByBudgetUserIdAndAccountId(Long id, LocalDateTime startDate, LocalDateTime endDate);
}
