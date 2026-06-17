package org.example.week1;

import java.util.Scanner;

class SwappinNumber {

        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number : ");
            int num2 = sc.nextInt();
            System.out.println("Before Swapping : " + num1 +" "+ num2);
            num1 = num1 + num2;  //30
            num2 = num1 - num2;  //10
            num1 = num1 - num2;  //20

            System.out.println("After Swapping : " + num1 +" "+ num2);
        }

}
