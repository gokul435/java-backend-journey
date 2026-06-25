package org.example.week3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaExp {
    public static void main(String [] args){
//        Runnable r = () ->  System.out.println("Running....");
//        r.run();
//
//        Predicate<Integer> isPositive = num -> num>0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-5));
//
//        Function<String, String> len = str -> str.toUpperCase();
//        System.out.println(len.apply("hello"));
//        System.out.println(len.apply("dobby"));

;


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> names = Arrays.asList("Gokul", "Raj", "Kumar", "Dobby", "Goku", "Raj");

        List<Integer> evenNum = numbers.stream().filter(num-> num%2==0).collect((Collectors.toList()));
        System.out.println(evenNum);

        Integer num = numbers.stream().reduce((a, b) ->a+b).orElse(0);
        System.out.println(num);

        List<String> name = names.stream().map(str -> str.toUpperCase()).collect((Collectors.toList()));
        System.out.println(name);

        List<String> dist = names.stream().distinct().collect((Collectors.toList()));
        System.out.println(dist);

        names.stream().filter(name1 -> name1.length()>3).sorted().forEach(name1 -> System.out.println(name1));
        Long numCount = numbers.stream().filter(num1->num1>5).count();
        System.out.println(numCount);
    }


}
