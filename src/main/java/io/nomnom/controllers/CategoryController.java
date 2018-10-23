package io.nomnom.controllers;

import io.nomnom.entities.Category;
import io.nomnom.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:7777")
@RestController
@RequestMapping("/api")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/categories")
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @PutMapping("/categories/{id}")
    public void updateCategory(@RequestBody Category category, @PathVariable int id) {
        categoryService.updateCategory(category, id);
    }

    @DeleteMapping("/categories/{id}")
    public void removeCategory(@PathVariable int id){
        categoryService.removeCategory(id);
    }

}
