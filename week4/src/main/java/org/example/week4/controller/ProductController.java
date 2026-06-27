package org.example.week4.controller;

import org.example.week4.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private List<Product> products = new ArrayList<>();
    private Integer nextId = 1;

    public ProductController(){
        products.add(new Product(nextId++, "POCO", 99.0, "Mobile phone"));
        products.add(new Product(nextId++, "Honor", 99.0, "Mobile phone"));
        products.add(new Product(nextId++, "Redmi", 99.0, "Mobile phone"));
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
        public Product getProductById(@PathVariable Integer id){
        for(Product product:products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Integer id){
        for(Product product: products){
            if(product.getId()==id){
                products.remove(product);
                return "Product " + id +" removed ";
            }
        }
        return "Product not found";
    }


}
