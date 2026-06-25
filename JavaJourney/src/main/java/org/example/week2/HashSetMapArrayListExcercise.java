package org.example.week2;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetMapArrayListExcercise {

    public static void main(String[] args) {
//        int[] arr = {2, 5, 1, 2, 3, 5};
//        HashSet<Integer> seen = new HashSet<>();
//        for (int num : arr) {
//            if (seen.contains(num)) {
//                System.out.println("First repeating element : " + num);
//                break;
//            } else {
//                seen.add(num);
//            }
//        }
//        HashMap<Character, Integer> count = new HashMap<>();
//
//        String str = "HELLOooo";
//        for(char ch : str.toCharArray()){
//            if(count.containsKey(ch)){
//                count.put(ch, count.get(ch)+1);
//            }
//            else{
//                count.put(ch, 1);
//            }
//        }
//        System.out.println(count);

        int[] arr = {1, 2, 3, 2, 4, 5, 1, 5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if(seen.contains(num)){
                duplicates.add(num);
            }
            else {
                seen.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
