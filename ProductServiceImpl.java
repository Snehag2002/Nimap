package Sneha.nimap.example.SnehaNimapApplication.service;

import Sneha.nimap.example.SnehaNimapApplication.Exception.NotFoundException;
import Sneha.nimap.example.SnehaNimapApplication.model.Category;
import Sneha.nimap.example.SnehaNimapApplication.model.Product;
import Sneha.nimap.example.SnehaNimapApplication.repository.CategoryRepository;
import Sneha.nimap.example.SnehaNimapApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    // add product here
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // update product here
    @Override
    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found with given id"));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCategory(product.getCategory());
        return productRepository.save(existingProduct);
    }

    // delete product
    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found with given id"));
        productRepository.delete(product);
    }

    // view all product here
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // get single product by id
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new NotFoundException("Product not found with given id"));
    }

    // get category with products
    @Override
    public Category getCategoryWithProducts(Long categoryId) {

        return categoryRepository.findById(categoryId).orElseThrow(() -> new NotFoundException("Category not found with given id"));
    }
}
