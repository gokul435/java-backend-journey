package org.example.week4.repository;
import org.example.week4.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();
    private Integer nextId = 1;

    public ProductRepository() {
        // Load sample data when app starts
        products.add(new Product(nextId++, "POCO", 99.0, "Mobile phone"));
        products.add(new Product(nextId++, "Honor", 99.0, "Mobile phone"));
        products.add(new Product(nextId++, "Redmi", 99.0, "Mobile phone"));
    }

    //get all products
    public List<Product> findAll(){
        return products;
    }

    //get Product by ID
    public Product findById(@PathVariable Integer id){
        for(Product product:products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    //add product
    public Product save(@RequestBody Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    //delete product by ID
    public String delete(@PathVariable Integer id){
        for(Product product: products){
            if(product.getId()==id){
                products.remove(product);
                return "Product " + id +" removed ";
            }
        }
        return "Product not found";
    }

    //Search product by name
    public List<Product> findByName(@RequestParam String name){

        List<Product> result = new ArrayList<>();
        for(Product product: products){
            if(product.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(product);
            }
        }
        return result;
    }

    //update existing product
    public Product update(@PathVariable Integer id, @RequestBody Product updateProduct){
        for(Product product : products){
            if(product.getId().equals(id)){
                product.setName(updateProduct.getName());
                product.setPrice(updateProduct.getPrice());
                product.setCategory(updateProduct.getCategory());

                return product;
            }
        }
        return null;
    }
}
