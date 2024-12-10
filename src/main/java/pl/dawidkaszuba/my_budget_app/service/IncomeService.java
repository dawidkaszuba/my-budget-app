package pl.dawidkaszuba.my_budget_app.service;

import pl.dawidkaszuba.my_budget_app.model.Income;

import java.time.LocalDateTime;
import java.util.List;

public interface IncomeService {

    List<Income> findAllByBudgetUserIdAndAccountId(Long accountId, LocalDateTime startDate, LocalDateTime endDate);
}
