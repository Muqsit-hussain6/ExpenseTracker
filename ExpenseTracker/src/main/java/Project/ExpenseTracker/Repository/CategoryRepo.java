package Project.ExpenseTracker.Repository;

import Project.ExpenseTracker.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> {
}
