package Project.ExpenseTracker.Repository;

import Project.ExpenseTracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
