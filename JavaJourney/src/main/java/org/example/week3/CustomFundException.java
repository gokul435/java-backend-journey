package org.example.week3;

public class CustomFundException extends RuntimeException{
    public CustomFundException(String message){
        super(message);
    }

    public static void withdraw(double bal, double amount){
        if(amount>bal){
            throw new CustomFundException("Not enough funds!");
        }
        else{
            System.out.println("Successfully done.....");
        }
    }
    public static void main(String [] args){
        try{
            withdraw(100, 80);
            withdraw(100, 800);
        }catch(CustomFundException e){
            System.out.println("error : " + e.getMessage());
        }
    }
}
