package pl.dawidkaszuba.my_budget_app.service.impl;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.my_budget_app.mapper.ExpenseMapper;
import pl.dawidkaszuba.my_budget_app.model.Expense;
import pl.dawidkaszuba.my_budget_app.service.ExpenseService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseMapper expenseMapper;

    public ExpenseServiceImpl(ExpenseMapper expenseMapper) {
        this.expenseMapper = expenseMapper;
    }

    @Override
    public List<Expense> findAllByBudgetUserIdAndAccountId(Long id, LocalDateTime startDate, LocalDateTime endDate) {
        return expenseMapper.findAllByBudgetUserIdAndAccountId(id, startDate, endDate);
    }
}
