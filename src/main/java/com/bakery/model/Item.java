package com.bakery.model;

// Abstract class for bakery items
public abstract class Item {
    private int id;
    private String name;
    private double price;
    
    // Constructors
    public Item() {
    }
    
    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Methods from UML
    public int getId() {
        return this.id;
    }
    
    public void updatePrice(float newPrice) {
        this.price = newPrice;
    }
    
    public String getDetails() {
        return "Item ID: " + id + ", Name: " + name + ", Price: " + price;
    }
    
    public void setDescription(String desc) {
        // To be implemented by subclasses
    }
}