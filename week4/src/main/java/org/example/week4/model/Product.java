package org.example.week4.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Product {
    private Integer id;
    private String name;
    private Double price;
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
        this.name = category;
    }
}
