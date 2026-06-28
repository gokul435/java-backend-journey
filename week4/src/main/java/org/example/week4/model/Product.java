package org.example.week4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public class Product {

    private Integer id;
    @NotBlank(message = "Name must not be empty")
    @Size(min = 2, max = 50, message = "Name must be within 2 to 50 characters")
    private String name;
    @NotNull(message = "Price must not be null")
    @Positive(message = "Price must be positive")
    private Double price;
    @NotBlank(message = "Category must not be empty")
    private String category;

    public Product(Integer id,String name, Double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product(){

    }
    public Integer getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Double getPrice(){
        return this.price;
    }
    public String getCategory(){
        return this.category;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setCategory(String category){
        this.category = category;
    }
}
