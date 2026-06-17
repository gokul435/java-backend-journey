package org.example.week1;

public class RoughUse {

    static void printSum(int... numbers) {
        int total = 0;
        for(int num : numbers) {
            total += num;
        }
        System.out.println(total);
    }
    public static void main(String [] args){

// Test it:
        printSum(5, 10);        // should print 15
        printSum(5, 10, 15);    // should print 30
        printSum();
    }
}
