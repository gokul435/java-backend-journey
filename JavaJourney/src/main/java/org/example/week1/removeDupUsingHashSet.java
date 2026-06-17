package org.example.week1;

import java.util.Arrays;
import java.util.HashSet;

public class removeDupUsingHashSet {
    public static void main(String [] args){

        int [] arr = {1,2,3,4,2,2,3,3,2,2};
        System.out.println("Before removing duplicate "+ Arrays.toString(arr));

        HashSet<Integer> set = new HashSet<>();

        int count = 0;
        for(int x : arr){
            set.add(x); //HashSet wont allow the deuplicate
        }
        System.out.println("After removing duplicate "+ set);

    }


}
