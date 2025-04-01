package Sneha.nimap.example.SnehaNimapApplication.repository;

import sheetal.nimap.example.sheetal_NimapApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}