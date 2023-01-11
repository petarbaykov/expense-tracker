package com.uni.expensetracker.controllers;

import com.uni.expensetracker.entities.Expense;
import com.uni.expensetracker.repositories.ExpenseRepository;
import com.uni.expensetracker.services.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {
    private final ExpenseService service;

    ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping("/expenses")
    List<Expense> all() {
        return service.findAll();
    }
}
