package org.example.week2;

public class Account {
    String accountHolder;
    int AccountNumber;
    private double balance;

    public Account(String accountHolder, int AccountNumber, double balance){
        this.accountHolder = accountHolder;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance = balance + amount;
        }
        else{
            System.out.println("Invalid amount.....");
        }
    }

    public void withdraw(double amount){
        if(balance>0 && amount<=balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient fund.....");
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    public int getAccountNumber(){
        return this.AccountNumber;
    }

    @Override
    public String toString() {
        return "Account Holder : " + getAccountHolder() + ", Account Number : " + getAccountNumber() + ", Balance is : $" + getBalance();
    }
}
