package org.example.week3;

public class Exceptions {

    public static void main(String args []){
        try{
            int a = 10;
            int b = 0;
            int result = a/b;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }finally{
            System.out.println("Operation complete!");
        }

        try{
            String input = "abcde";
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            System.out.println("Invalid number format!");
        }


        try{
            int []arr = {1,2,3};
            int out = arr[10];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You're trying to access invalid position....");
        }


    }
}


