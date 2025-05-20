import com.bakery.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.bakery.repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Basic CRUD operations are automatically provided by JpaRepository
    
    // You can add custom query methods here if needed
    // For example:
    // List<Order> findByCustomerId(Long customerId);
    // List<Order> findByOrderDate(LocalDate orderDate);
}