package com.bakery.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(nullable = false)
    private BigDecimal price;
    
    private String imageUrl;
    
    private Integer stockQuantity;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;
    
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();
    
    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;
    
    private Boolean isAvailable = true;
    
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    
    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
    
    // Method to calculate average rating from reviews
    public Double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0.0;
        }
        
        double sum = reviews.stream()
                .mapToInt(Review::getRating)
                .sum();
                
        return sum / reviews.size();
=======
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
>>>>>>> 1ff6552de168d03bbbe74bf3f329f2eb53c19ebd
    }
}