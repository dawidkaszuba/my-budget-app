package pl.dawidkaszuba.my_budget_app.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dawidkaszuba.my_budget_app.model.Budget;
import pl.dawidkaszuba.my_budget_app.service.BudgetService;


import java.time.LocalDateTime;

@Tag(name = "Budget", description = "Budget management")
@RestController
@RequestMapping("api/budget")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @Operation(summary = "Load all budget values")
    @GetMapping("{budgetUserId}")
    public ResponseEntity<Budget> getBudgetState(@PathVariable("budgetUserId") Long budgetUserId,
                                                 @RequestParam("startDate") LocalDateTime startDate,
                                                 @RequestParam("endDate") LocalDateTime endDate) {

        return ResponseEntity.ok(budgetService.getBudgetByBudgetUserId(budgetUserId, startDate, endDate));
    }
}
