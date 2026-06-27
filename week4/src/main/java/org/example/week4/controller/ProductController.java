package org.example.week4.controller;

import org.example.week4.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private List<Product> products = new ArrayList<>();

    public ProductController(){
        products.add(new Product(1, "POCO", 99, "Mobile phone"));
        products.add(new Product(2, "Honor", 99, "Mobile phone"));
        products.add(new Product(3, "Redmi", 99, "Mobile phone"));
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello from the Spring Application";
    }

    @GetMapping("/products")
        public List<Product> allProducts(){
         return products;
        }

    @GetMapping("/products/{id}")
        public Product getProductById(@PathVariable int id){
        for(Product product:products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
