package com.example.productdb.service;

import com.example.productdb.model.Product;
import com.example.productdb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    // GET ALL
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // GET BY ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // ADD
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // UPDATE
    public Product updateProduct(Long id, Product updatedProduct) {
        Optional<Product> existing = productRepository.findById(id);
        if(existing.isPresent()) {
            Product product = existing.get();
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setCategory(updatedProduct.getCategory());
            return productRepository.save(product); // save updated!
        }
        return null;
    }

    // DELETE
    public String deleteProduct(Long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product " + id + " deleted successfully!";
        }
        return "Product not found!";
    }

    //SEARCH
    public List<Product> searchByName(String name){
        return productRepository.findByNameContainingIgnoreCase(name);
    }
}
