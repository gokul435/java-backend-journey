package com.example.productdb.repository;

import com.example.productdb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Spring generates this SQL automatically just from the method name!
    // SELECT * FROM products WHERE LOWER(name) LIKE LOWER('%keyword%')
    List<Product> findByNameContainingIgnoreCase(String name);
}
