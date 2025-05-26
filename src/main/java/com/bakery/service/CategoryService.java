package service;

import model.Category;
import exception.CategoryNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    private List<Category> categories = new ArrayList<>();
    private int idCounter = 1;

    public List<Category> getAllCategories() {
        return categories;
    }

    public Category getCategoryById(int id) {
        return categories.stream()
                .filter(cat -> cat.getId() == id)
                .findFirst()
                .orElseThrow(() -> new CategoryNotFoundException("Kategori ID " + id + " tidak ditemukan."));
    }

    public Category createCategory(String name) {
        Category category = new Category(idCounter++, name);
        categories.add(category);
        return category;
    }

    public Category updateCategory(int id, String newName) {
        Category category = getCategoryById(id);
        category.setName(newName);
        return category;
    }

    public void deleteCategory(int id) {
        Category category = getCategoryById(id);
        categories.remove(category);
    }
}
