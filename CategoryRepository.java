package Sneha.nimap.example.SnehaNimapApplication.repository;

import sheetal.nimap.example.sheetal_NimapApplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
