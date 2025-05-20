package com.bakery.model;

public class Admin extends User {

    private String role;
    private List<Product> products = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

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

    // Methods implementation
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
            System.out.println("Product added successfully: " + product.getName());
        } else {
            System.out.println("Failed to add product: Product cannot be null");
        }
    }

    public void updateProduct(int productId, Product newDetails) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                products.set(i, newDetails);
                System.out.println("Product updated successfully");
                return;
            }
        }
        System.out.println("Product not found with ID: " + productId);
    }

    public void deleteProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
        System.out.println("Product deleted with ID: " + productId);
    }

    public void addCategory(Category category) {
        if (category != null) {
            categories.add(category);
            System.out.println("Category added successfully: " + category.getName());
        } else {
            System.out.println("Failed to add category: Category cannot be null");
        }
    }

    public void updateOrderStatus(int orderId, String newStatus) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                order.setStatus(newStatus);
                System.out.println("Order status updated to: " + newStatus);
                return;
            }
        }
        System.out.println("Order not found with ID: " + orderId);
    }
}