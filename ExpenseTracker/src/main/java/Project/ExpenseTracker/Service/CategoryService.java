package Project.ExpenseTracker.Service;

import Project.ExpenseTracker.Model.Category;

public interface CategoryService {
    Category createCategory(Category category);
    Category getCategoryById(Long categoryId);
    // Add more methods as needed
}
