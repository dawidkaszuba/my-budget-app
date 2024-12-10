package pl.dawidkaszuba.my_budget_app.service.impl;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.my_budget_app.mapper.BudgetMapper;
import pl.dawidkaszuba.my_budget_app.model.Budget;
import pl.dawidkaszuba.my_budget_app.service.BudgetService;

import java.time.LocalDateTime;

@Service
public class BudgetServiceImpl implements BudgetService {

    private final BudgetMapper budgetMapper;

    public BudgetServiceImpl(BudgetMapper budgetMapper) {
        this.budgetMapper = budgetMapper;
    }

    @Override
    public Budget getBudgetByBudgetUserId(Long budgetUserId, LocalDateTime startDate, LocalDateTime endDate) {
        return budgetMapper.getBudgetByBudgetUserId(budgetUserId, startDate, endDate);
    }
}
