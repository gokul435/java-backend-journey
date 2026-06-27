package org.example.week4.repository;
import org.example.week4.model.Product;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<Product> findById(Integer id){
        for(Product product:products) {
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    //add product
    public Product save( Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    //delete product by ID
    public String delete( Integer id){
        for(Product product: products){
            if(product.getId().equals(id)){
                products.remove(product);
                return "Product " + id +" removed ";
            }
        }
        return "Product not found";
    }

    //Search product by name
    public List<Product> findByName( String name){

        List<Product> result = new ArrayList<>();
        for(Product product: products){
            if(product.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(product);
            }
        }
        return result;
    }

    //update existing product
    public Product update( Integer id, Product updateProduct){
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
