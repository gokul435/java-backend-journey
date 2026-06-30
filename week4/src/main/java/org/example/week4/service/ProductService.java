package org.example.week4.service;
import org.example.week4.model.Product;
import org.example.week4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> allProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id){
        return productRepository.findById(id);
    }

    public Product addProduct( Product product){
        return productRepository.save(product);
    }

    public String deleteProduct( Integer id){
        return productRepository.delete(id);
    }

    public List<Product> searchProduct( String name){
        return productRepository.findByName(name);
    }


    public Product updateProduct( Integer id,  Product updateProduct){
        return productRepository.update(id,updateProduct);
    }
}
