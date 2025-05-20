package com.bakery.model;

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

    public void setRole(String role) {
        this.role = role;
    }

    // Methods from UML
    public void addProduct(Product product) {
        // Implementation would depend on how products are stored
        // This could involve a call to a ProductService or ProductRepository
    }

    public void updateProduct(int productId, Product newDetails) {
        // Implementation would depend on how products are stored and updated
    }

    public void deleteProduct(int productId) {
        // Implementation would depend on how products are deleted
    }

    public void addCategory(Category category) {
        // Implementation would depend on how categories are stored
    }

    public void updateOrderStatus(int orderId, String newStatus) {
        // Implementation would depend on how orders are managed
    }
}

