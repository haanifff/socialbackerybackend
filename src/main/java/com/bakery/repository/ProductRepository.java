package com.bakery.repository;

import com.bakery.model.Product;

import java.util.*;

public class ProductRepository {
    private final Map<Long, Product> products = new HashMap<>();
    private long idCounter = 1;

    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(idCounter++);
        }
        products.put(product.getId(), product);
        return product;
    }

    public Product findById(Long id) {
        return products.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public void deleteById(Long id) {
        products.remove(id);
    }

    public boolean existsById(Long id) {
        return products.containsKey(id);
    }
}
