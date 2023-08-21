package Project.ExpenseTracker.Service.Impl;

import Project.ExpenseTracker.Model.Category;
import Project.ExpenseTracker.Repository.CategoryRepo;
import Project.ExpenseTracker.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    // Implement other CategoryService methods
}
