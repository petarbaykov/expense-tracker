package com.uni.expensetracker.services;

import com.uni.expensetracker.entities.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAll();
}
