package com.bakery.repository;

import com.bakery.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoryRepository {

    private final List<Category> categories = new ArrayList<>();
    private int idCounter = 1;

    public List<Category> findAll() {
        return categories;
    }

    public Optional<Category> findById(int id) {
        return categories.stream().filter(c -> c.getId() == id).findFirst();
    }

    public Category save(Category category) {
        if (category.getId() == 0) {
            category.setId(idCounter++);
            categories.add(category);
        } else {
            Category existing = findById(category.getId()).orElse(null);
            if (existing != null) {
                existing.setName(category.getName());
            }
        }
        return category;
    }

    public void deleteById(int id) {
        categories.removeIf(c -> c.getId() == id);
    }

    public boolean existsById(int id) {
        return findById(id).isPresent();
    }
}
