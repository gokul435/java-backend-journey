package org.example.week3;

import java.util.Arrays;
import java.util.List;

public class Methodeference {

    public static void main(String [] args){
        List<String> names = Arrays.asList("Gokul", "Kumar", "Raj");
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        names.stream().forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        numbers.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
