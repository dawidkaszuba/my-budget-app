package pl.dawidkaszuba.my_budget_app.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dawidkaszuba.my_budget_app.model.Expense;
import pl.dawidkaszuba.my_budget_app.service.ExpenseService;

import java.time.LocalDateTime;
import java.util.List;


@Tag(name = "Expenses", description = "Expenses management")
@RestController
@RequestMapping("api/expenses")
public class ExpensesController {

    private final ExpenseService expenseService;

    public ExpensesController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @Operation(summary = "Load all expenses per account and date time range")
    @GetMapping("{accountId}")
    public ResponseEntity<List<Expense>> getAllExpenses(@PathVariable("accountId") Long accountId,
                                                        @RequestParam("startDate") LocalDateTime startDate,
                                                        @RequestParam("endDate") LocalDateTime endDate) {

        return ResponseEntity.ok(expenseService.findAllByBudgetUserIdAndAccountId(accountId, startDate, endDate));
    }
}
