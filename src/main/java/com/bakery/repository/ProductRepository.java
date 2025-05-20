import com.bakery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.bakery.repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Basic CRUD operations are automatically implemented by Spring Data JPA
    // You can add custom query methods here if needed
}