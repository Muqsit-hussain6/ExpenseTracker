package Project.ExpenseTracker.Repository;

import Project.ExpenseTracker.Model.Expense;
import Project.ExpenseTracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepo extends JpaRepository<Expense,Long> {
    List<Expense> findByUser(User user);
}
