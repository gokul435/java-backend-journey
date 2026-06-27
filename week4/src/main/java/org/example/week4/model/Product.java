package org.example.week4.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id,String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getCategory(){
        return this.category;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCategory(String category){
        this.name = category;
    }
}
