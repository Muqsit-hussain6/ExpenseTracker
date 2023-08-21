package Project.ExpenseTracker.Service;

import Project.ExpenseTracker.Model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);

    User getUserByUsername(String username);
    // Add more methods as needed
}
