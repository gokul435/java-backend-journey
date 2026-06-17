package org.example.week2;

public class BankAccount {
    String accHolder;
    Double balance;

    static int totalAccs = 0;
    static Double intRate = 5.0;

    BankAccount(String accHolder, Double balance){
        this.accHolder = accHolder;
        this.balance = balance;
        totalAccs++;
    }

    @Override
    public String toString() {
        return "Account holder : " + accHolder + ", Balance $ : " + balance;
    }

    public static void main(String [] args){
        BankAccount acc1 = new BankAccount("Dobby", 100000000.0);
        BankAccount acc2 = new BankAccount("Snape", 10000000000.0);
        BankAccount acc3 = new BankAccount("Raj", 1000.0);

        System.out.println(totalAccs);

        System.out.println(intRate);
        BankAccount.intRate = 6.0;

        System.out.println(intRate);

        System.out.println(acc1);
    }
}
