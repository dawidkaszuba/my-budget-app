package pl.dawidkaszuba.my_budget_app.service.impl;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.my_budget_app.mapper.IncomeMapper;
import pl.dawidkaszuba.my_budget_app.model.Income;
import pl.dawidkaszuba.my_budget_app.service.IncomeService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {

    private final IncomeMapper incomeMapper;

    public IncomeServiceImpl(IncomeMapper incomeMapper) {
        this.incomeMapper = incomeMapper;
    }

    @Override
    public List<Income> findAllByBudgetUserIdAndAccountId(Long accountId, LocalDateTime startDate, LocalDateTime endDate) {
        return incomeMapper.findAllByBudgetUserIdAndAccountId(accountId, startDate, endDate);
    }
}
