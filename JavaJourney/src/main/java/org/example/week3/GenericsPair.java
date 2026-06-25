package org.example.week3;

import java.sql.SQLOutput;

public class GenericsPair<T, U> {
    private T first;
    private U second;
    GenericsPair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public U getSecond(){
        return this.second;
    }

    public static void main(String [] args){
        GenericsPair<String, Integer> person1 = new GenericsPair<>("Dobby", 22);

        GenericsPair<String, Double> person2 = new GenericsPair<>("Gokul", 26.0);

        System.out.println(person1.getFirst());
        System.out.println(person1.getSecond());

        System.out.println(person2.getFirst());
        System.out.println(person2.getSecond());
    }
}
