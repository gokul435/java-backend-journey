package org.example.week1;

import java.util.Scanner;

public class PositiveNumbers {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("The number you entered is positive : " + num);
        }
        else if(num<0){
            System.out.println("The number you entered is negative : " + num);
        }
        else{
            System.out.println("The number you entered is zero : " + num);
        }
    }
}
