package org.example.week4.controller;

import org.example.week4.model.Product;
import org.example.week4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/hello")
    public String hello(){
        return "Hello from the Spring Application";
    }

    @GetMapping("/products")
        public List<Product> allProducts(){
         return productService.allProducts();
        }

    @GetMapping("/products/{id}")
        public Optional<Product> getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> searchProduct(@RequestParam String name){
        return productService.searchProduct(name);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updateProduct){
        return productService.updateProduct(id, updateProduct);
    }
}
