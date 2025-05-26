package com.bakery.controller;

import com.bakery.dto.request.ProductRequest;
import com.bakery.dto.response.ProductResponse;
import com.bakery.service.ProductService;
import org.springframework.stereotype.Controller;

import java.util.List;

public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    public ProductResponse create(ProductRequest request) {
        return service.createProduct(request);
    }

    public ProductResponse get(Long id) {
        return service.getProduct(id);
    }

    public List<ProductResponse> getAll() {
        return service.getAllProducts();
    }

    public ProductResponse update(Long id, ProductRequest request) {
        return service.updateProduct(id, request);
    }

    public void delete(Long id) {
        service.deleteProduct(id);
    }
}
