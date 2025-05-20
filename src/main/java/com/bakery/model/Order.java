package com.bakery.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double totalPrice;
    private String status;
    private int userId;
    private List<Product> products;
    private int[] quantities; // To store quantity for each product
    
    // Constructors
    public Order() {
        this.products = new ArrayList<>();
    }
    
    public Order(int id, int userId, String status) {
        this.id = id;
        this.userId = userId;
        this.status = status;
        this.totalPrice = 0.0;
        this.products = new ArrayList<>();
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
        calculateTotalPrice();
    }
    
    // Methods from UML
    public void addProduct(Product product, int quantity) {
        // Add product to order
        this.products.add(product);
        
        // Update quantity (in a real application, this would be more sophisticated)
        // This is a simplified approach for demonstration
        int currentSize = this.products.size();
        int[] newQuantities = new int[currentSize];
        if (quantities != null) {
            System.arraycopy(quantities, 0, newQuantities, 0, quantities.length);
        }
        newQuantities[currentSize - 1] = quantity;
        this.quantities = newQuantities;
        
        // Update price
        calculateTotalPrice();
    }
    
    public void removeProduct(int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                products.remove(i);
                
                // Update quantities array
                int[] newQuantities = new int[products.size()];
                int newIndex = 0;
                for (int j = 0; j < quantities.length; j++) {
                    if (j != i) {
                        newQuantities[newIndex++] = quantities[j];
                    }
                }
                quantities = newQuantities;
                
                // Recalculate total price
                calculateTotalPrice();
                break;
            }
        }
    }
    
    public float calculateTotalPrice() {
        totalPrice = 0.0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice() * (quantities != null ? quantities[i] : 1);
        }
        return (float)totalPrice;
    }
    
    public String getOrderStatus() {
        return this.status;
    }
    
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    
    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Order ID: ").append(id)
               .append(", Status: ").append(status)
               .append(", Total Price: $").append(String.format("%.2f", totalPrice))
               .append("\nProducts:\n");
        
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantity = quantities != null && i < quantities.length ? quantities[i] : 1;
            details.append("  - ").append(product.getName())
                   .append(" (Qty: ").append(quantity)
                   .append(") @ $").append(String.format("%.2f", product.getPrice()))
                   .append(" each\n");
        }
        
        return details.toString();
    }
}