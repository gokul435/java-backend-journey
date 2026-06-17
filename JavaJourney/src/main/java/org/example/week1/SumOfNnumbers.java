package org.example.week1;

import java.util.Scanner;

//Start from th e1 instead of 0
// There is formula (num*(num+1))/2 instead of loops
class SumOfNnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<=num; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
