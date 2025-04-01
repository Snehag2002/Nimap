package Sneha.nimap.example.SnehaNimapApplication.service;

import Sneha.nimap.example.SnehaNimapApplication.model.Category;
import Sneha.nimap.example.SnehaNimapApplication.model.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Category getCategoryWithProducts(Long categoryId);
}