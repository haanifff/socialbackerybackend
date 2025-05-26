package com.bakery.dto.request;

public class ProductRequest {
    public Long id;
    public String name;
    public String description;
    public double price;
    public String imageUrl;

    public ProductRequest(Long id, String name, String description, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}