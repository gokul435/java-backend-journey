package org.example.week2;

import java.util.HashMap;

public class HashMapExcercise {

    public static void main(String[] args) {

        HashMap<String, Double> fruitPrice = new HashMap<>();


        fruitPrice.put("Banana", 10.0);
        fruitPrice.put("Apple", 150.0);
        fruitPrice.put("Mango", 50.0);
        fruitPrice.put("Orange", 100.0);

        System.out.println(fruitPrice.get("Mango"));

        System.out.println(fruitPrice.containsKey("Orange"));

        fruitPrice.remove("Banana");

        for (String keyVal : fruitPrice.keySet()) {
            Double price = fruitPrice.get(keyVal);
            System.out.println(keyVal + " costs $" + price);
        }
    }


}
