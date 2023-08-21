package Project.ExpenseTracker.Service;

import Project.ExpenseTracker.Model.Expense;
import Project.ExpenseTracker.Model.User;

import java.util.List;

public interface ExpenseService {
    Expense createExpense(Expense expense);
    Expense getExpenseById(Long expenseId);
    List<Expense> getExpensesByUser(User user);
    // Add more methods as needed
}
