package io.nomnom.services;

import io.nomnom.entities.Category;
import io.nomnom.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }


    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void updateCategory(Category category, int id) {
        category.setId(id);
        categoryRepository.save(category);
    }

    public void removeCategory(int id) {
        Category category = categoryRepository.findById(id).get();
        categoryRepository.delete(category);
    }
}
