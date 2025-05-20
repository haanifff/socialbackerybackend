package com.bakery.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String email;
    private String address;
    private List<Product> cart;
    private List<Order> orders;
    
    // Constructors
    public Customer() {
        super();
        this.cart = new ArrayList<>();
        this.orders = new ArrayList<>();
    }
    
    public Customer(int id, String username, String password, String email, String address) {
        super(id, username, password);
        this.email = email;
        this.address = address;
        this.cart = new ArrayList<>();
        this.orders = new ArrayList<>();
    }
    
    // Getters and setters
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public List<Product> getCart() {
        return cart;
    }
    
    public List<Order> getOrders() {
        return orders;
    }
    
    // Methods from UML
    public void placeOrder(Order order) {
        this.orders.add(order);
        // Clear cart after placing an order
        this.cart.clear();
    }
    
    public void addToCart(Product product, int quantity) {
        // In a real application, you might want to check stock and handle duplicates
        for (int i = 0; i < quantity; i++) {
            this.cart.add(product);
        }
    }
    
    public List<Product> viewCart() {
        return this.cart;
    }
    
    @Override
    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
}