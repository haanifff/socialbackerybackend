package com.bakery.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private int id;
    private String name;
    private String description;
    private List<Product> products;
    
    // Constructors
    public Category() {
        this.products = new ArrayList<>();
    }
    
    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    // Methods from UML
    public void addProduct(Product product) {
        this.products.add(product);
        product.setCategory(this);
    }
    
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
    
    public List<Product> getProducts() {
        return this.products;
    }
    
    public String getCategoryName() {
        return this.name;
    }
    
    public void updateCategoryName(String newName) {
        this.name = newName;
    }
}