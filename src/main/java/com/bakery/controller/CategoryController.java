package com.bakery.service;

import com.bakery.model.Category;
import com.bakery.repository.CategoryRepository;
import com.bakery.exception.CategoryNotFoundException;

import java.util.List;

public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService() {
        this.repository = new CategoryRepository();
    }

    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    public Category getCategoryById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Kategori dengan ID " + id + " tidak ditemukan"));
    }

    public Category createCategory(String name) {
        Category category = new Category(0, name);
        return repository.save(category);
    }

    public Category updateCategory(int id, String newName) {
        Category category = getCategoryById(id);
        category.setName(newName);
        return repository.save(category);
    }

    public void deleteCategory(int id) {
        if (!repository.existsById(id)) {
            throw new CategoryNotFoundException("Kategori ID " + id + " tidak ditemukan untuk dihapus");
        }
        repository.deleteById(id);
    }
}
