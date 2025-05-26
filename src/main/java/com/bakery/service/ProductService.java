package com.bakery.service;

import com.bakery.dto.ProductRequest;
import com.bakery.dto.ProductResponse;
import com.bakery.exception.ProductNotFoundException;
import com.bakery.model.Product;
import com.bakery.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponse createProduct(ProductRequest request) {
        Product product = new Product(null, request.name, request.description, request.price, request.imageUrl);
        product = repository.save(product);
        return toResponse(product);
    }

    public ProductResponse getProduct(Long id) {
        Product product = repository.findById(id);
        if (product == null) throw new ProductNotFoundException(id);
        return toResponse(product);
    }

    public List<ProductResponse> getAllProducts() {
        return repository.findAll().stream().map(this::toResponse).collect(Collectors.toList());
    }

    public ProductResponse updateProduct(Long id, ProductRequest request) {
        Product product = repository.findById(id);
        if (product == null) throw new ProductNotFoundException(id);
        product.name = request.name;
        product.description = request.description;
        product.price = request.price;
        product.imageUrl = request.imageUrl;
        return toResponse(repository.save(product));
    }

    public void deleteProduct(Long id) {
        if (!repository.existsById(id)) throw new ProductNotFoundException(id);
        repository.deleteById(id);
    }

    private ProductResponse toResponse(Product product) {
        return new ProductResponse(product.id, product.name, product.description, product.price, product.imageUrl);
    }
}
