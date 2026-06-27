package org.example.week4.service;
import org.example.week4.model.Product;
import org.example.week4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> allProducts(){
        return productRepository.findAll();
    }


    public Product getProductById(@PathVariable Integer id){
        return productRepository.findById(id);
    }


    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    public String deleteProduct(@PathVariable Integer id){
        return productRepository.delete(id);
    }

    public List<Product> searchProduct(@RequestParam String name){
        return productRepository.findByName(name);
    }


    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updateProduct){
        return productRepository.update(id,updateProduct);
    }
}
