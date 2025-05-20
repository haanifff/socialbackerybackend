import com.bakery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.bakery.repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here
    User findByEmail(String email);
    User findByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}