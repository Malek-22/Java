package com.savetravels.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.savetravels.savetravels.models.Expense;
import com.savetravels.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public List<Expense> allExpenses() {
        return repo.findAll();
    }

    public Expense createExpense(Expense expense) {
        return repo.save(expense);
    }

    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = repo.findById(id);
        if (optionalExpense.isPresent()) {
            return optionalExpense.get();
        }
        return null;
    }

    public Expense updateExpense(Expense expense) {
        return repo.save(expense);
    }

    public void deleteExpense(Expense expense) {
        repo.delete(expense);
    }
}