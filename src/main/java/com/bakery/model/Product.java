package com.bakery.model;

public class Product extends Item {
    private int stock;
    private String imagePath;
    private String description;
    private Category category;
    
    // Constructors
    public Product() {
        super();
    }
    
    public Product(int id, String name, double price, int stock, String imagePath, 
                  String description, Category category) {
        super(id, name, price);
        this.stock = stock;
        this.imagePath = imagePath;
        this.description = description;
        this.category = category;
    }
    
    // Getters and setters
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getImagePath() {
        return imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    
    // Methods from UML
    public int getStock() {
        return this.stock;
    }
    
    public void updateStock(int quantity) {
        this.stock += quantity;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    
    public void addImage(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public boolean isAvailable() {
        return this.stock > 0;
    }
}