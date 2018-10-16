package io.nomnom.controllers;

import io.nomnom.entities.Category;
import io.nomnom.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
