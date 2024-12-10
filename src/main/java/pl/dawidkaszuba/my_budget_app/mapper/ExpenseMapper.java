package pl.dawidkaszuba.my_budget_app.mapper;

import org.apache.ibatis.annotations.Param;
import pl.dawidkaszuba.my_budget_app.model.Expense;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpenseMapper {
    List<Expense> findAllByBudgetUserIdAndAccountId(@Param("accountId") Long accountId,
                                     @Param("startDate") LocalDateTime startDate,
                                     @Param("endDate") LocalDateTime endDate);
}
