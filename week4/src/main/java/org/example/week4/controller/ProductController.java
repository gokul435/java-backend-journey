package org.example.week4.controller;

import jakarta.validation.Valid;
import org.example.week4.model.Product;
import org.example.week4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        public ResponseEntity<List<Product>> allProducts(){
        return ResponseEntity.ok(productService.allProducts());
        }

    @GetMapping("/products/{id}")
        public ResponseEntity<Product> getProductById(@PathVariable Integer id){
        Optional <Product> product = productService.getProductById(id);
        if(product.isPresent()){
            return ResponseEntity.ok(product.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product){
        Product saved = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer id){
        String deleted = productService.deleteProduct(id);
        return ResponseEntity.ok(deleted);
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String name){
        return ResponseEntity.ok(productService.searchProduct(name));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id,@Valid @RequestBody Product updateProduct){
        Product updated = productService.updateProduct(id, updateProduct);
        if(updated!=null){
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }
}
