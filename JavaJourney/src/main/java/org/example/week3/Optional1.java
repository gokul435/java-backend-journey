package org.example.week3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optional1 {

    public static void main(String [] args){
        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Kiwi");

        Optional <String> found = fruits.stream().filter(n -> n.startsWith("M")).findFirst();
        System.out.println("Found --- " + found);

        // Here the optional is not used because the value return by the functions is String
        String found1 = fruits.stream().filter(n -> n.startsWith("Z")).findFirst().orElse("Not found!");
        System.out.println("Found --- " + found1);

        //(Else we can print later using orElse)
        Optional <String> found2 = fruits.stream().filter(n -> n.startsWith("Z")).findFirst();
        System.out.println("Found --- " + found2.orElse("Not Found......"));

        Optional <String> found3 = fruits.stream().filter(n -> n.startsWith("K")).findFirst();
        found3.ifPresent(n-> System.out.println(found3));
    }
}
