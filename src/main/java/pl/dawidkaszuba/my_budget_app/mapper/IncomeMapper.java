package pl.dawidkaszuba.my_budget_app.mapper;

import org.apache.ibatis.annotations.Param;
import pl.dawidkaszuba.my_budget_app.model.Income;

import java.time.LocalDateTime;
import java.util.List;

public interface IncomeMapper {

    List<Income> findAllByBudgetUserIdAndAccountId(@Param("accountId") Long accountId,
                                                   @Param("startDate") LocalDateTime startDate,
                                                   @Param("endDate") LocalDateTime endDate);
}
