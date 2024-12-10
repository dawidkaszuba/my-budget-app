package pl.dawidkaszuba.my_budget_app.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dawidkaszuba.my_budget_app.model.Income;
import pl.dawidkaszuba.my_budget_app.service.IncomeService;

import java.time.LocalDateTime;
import java.util.List;

@Tag(name = "Incomes", description = "Incomes management")
@RestController
@RequestMapping("api/incomes")
public class IncomeController {

    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @Operation(summary = "Load all incomes per account and date time range")
    @GetMapping("{accountId}")
    public ResponseEntity<List<Income>> getAllExpenses(@PathVariable("accountId") Long accountId,
                                                       @RequestParam("startDate") LocalDateTime startDate,
                                                       @RequestParam("endDate") LocalDateTime endDate) {

        return ResponseEntity.ok(incomeService.findAllByBudgetUserIdAndAccountId(accountId, startDate, endDate));
    }
}
