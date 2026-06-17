package org.example.week1;

import java.util.ArrayList;

public class ArrayListExcercise {
    public static void main(String [] args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);

        System.out.println(fruits.size());

        fruits.remove("Banana");

        System.out.println(fruits);

        System.out.println(fruits.contains("Mango"));

        for(int i = 0; i<fruits.size(); i++){
            System.out.println(i+1 + " " +fruits.get(i));
        }

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
    }
}
