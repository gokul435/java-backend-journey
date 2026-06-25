package org.example.week3;

public class Product {
    public static void main(String [] args){
        Products prod1 = new Products("Fresh Juice", 50.0, "Good");
        Products prod2 = new Products("Fresh Pomo Juice", 80.0, "Excellent");

        System.out.println(prod1);
        System.out.println(prod2);

        System.out.println(prod1.name());
        System.out.println(prod2.price());
    }
}
