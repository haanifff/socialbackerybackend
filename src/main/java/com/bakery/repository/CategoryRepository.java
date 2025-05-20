import com.bakery.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.bakery.repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> 
{

}