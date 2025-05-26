package com.bakery.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private Long id;
    private String customerName;
    private List<String> items;
    private double totalAmount;
    private LocalDateTime orderDate;
    private String status;

    public Order() {
        this.items = new ArrayList<>();
        this.orderDate = LocalDateTime.now();
        this.status = "PENDING";
    }

    public Order(Long id, String customerName) {
        this();
        this.id = id;
        this.customerName = customerName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Helper methods
    public void addItem(String item) {
        this.items.add(item);
    }

    public void removeItem(String item) {
        this.items.remove(item);
    }
}