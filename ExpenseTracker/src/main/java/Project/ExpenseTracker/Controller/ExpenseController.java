package Project.ExpenseTracker.Controller;

import Project.ExpenseTracker.Model.Expense;
import Project.ExpenseTracker.Model.User;
import Project.ExpenseTracker.Service.ExpenseService;
import Project.ExpenseTracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/create")
    public ResponseEntity<String> createExpense(@RequestBody Expense expense) {
        Expense newExpense = expenseService.createExpense(expense);
        return ResponseEntity.ok("Expense created with ID: " + newExpense.getExpenseId());
    }

    @GetMapping("/{expenseId}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long expenseId) {
        Expense expense = expenseService.getExpenseById(expenseId);
        if (expense == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(expense);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Expense>> getExpensesByUser(@PathVariable Long userId) {
        User user = new User();
        user.setUserId(userId);

        List<Expense> expenses = expenseService.getExpensesByUser(user);
        if (expenses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(expenses);
    }
    UserService userService;
    @GetMapping
    public String listExpenses(Model model, Principal principal) {
        String username = principal.getName(); // Get logged-in user's username
        User user = userService.getUserByUsername(username);
        List<Expense> expenses = expenseService.getExpensesByUser(user);
        model.addAttribute("expenses", expenses);
        return "expense/list"; // Return the view name
    }
    // Add more controller methods as needed
}
