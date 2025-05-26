package com.bakery.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bakery.repository.ProductRepository;
import com.bakery.repository.CategoryRepository;
import com.bakery.repository.OrderRepository;

public class Admin extends User {

    private String role;

    // Constructors
    public Admin() {
        super();
    }

    public Admin(int id, String username, String password, String role) {
        super(id, username, password);
        this.role = role;
    }

    // Getters and setters
    public String getRole() {
        return role;
    }

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private OrderRepository orderRepository;

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        productRepository.save(product);
    }

    public void updateProduct(int productId, Product newDetails) {
        if (newDetails == null) {
            throw new IllegalArgumentException("New product details cannot be null");
        }
        Product existingProduct = productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        
        existingProduct.setName(newDetails.getName());
        existingProduct.setPrice(newDetails.getPrice());
        existingProduct.setDescription(newDetails.getDescription());
        productRepository.save(existingProduct);
    }

    public void deleteProduct(int productId) {
        Product product = productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        productRepository.delete(product);
    }

    public void addCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        categoryRepository.save(category);
    }

        public void updateOrderStatus(int orderId, String newStatus) {
            if (newStatus == null || newStatus.trim().isEmpty()) {
                throw new IllegalArgumentException("New status cannot be null or empty");
            }
            Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
            order.setStatus(newStatus);
            orderRepository.save(order);
        }
    }

    