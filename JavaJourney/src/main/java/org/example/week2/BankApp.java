package org.example.week2;

import java.util.HashMap;
import java.util.Scanner;

public class BankApp {
    static int accountCounter = 1000;

    public static void main(String [] args){

        HashMap<Integer, Account> accounts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to the Dobby Bank.....");
            System.out.println("1. create account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check balance");
            System.out.println("5. View Account details");
            System.out.println("6. Exit");

            int userChoice = sc.nextInt();

            if(userChoice == 1){

                sc.nextLine();
                System.out.println("Enter the account holder name : ");
                String accountHolder = sc.nextLine();
                System.out.println("Enter the initial deposit amount : ");
                double depositAmount = sc.nextDouble();
                int accountNumber = accountCounter;
                accountCounter++;

                Account account = new Account(accountHolder,accountNumber,depositAmount);

                accounts.put(accountNumber,account);
                System.out.println("Account created successfully...,,,");
            }

            else if(userChoice == 2){
                System.out.println("Enter your account number : ");
                int userAccNum = sc.nextInt();
                if(accounts.containsKey(userAccNum)){
                    Account account = accounts.get(userAccNum);
                    System.out.println("Enter the amount to deposit : ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);

                    System.out.println("After deposit your balance : " + account.getBalance());

                }
                else{
                    System.out.println("Error....");
                }
            }
            else if(userChoice == 3){
                System.out.println("Enter your account number : ");
                int userAccNumber = sc.nextInt();
                if(accounts.containsKey(userAccNumber)){
                    Account account = accounts.get(userAccNumber);
                    System.out.println("Enter the amount to withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("After withdraw your balance : " + account.getBalance());

                }
                else{
                    System.out.println("Error....");
                }

            }
            else if(userChoice == 4){
                System.out.println("Enter your account number : ");
                int userAccNumber = sc.nextInt();
                if(accounts.containsKey(userAccNumber)){
                    Account account = accounts.get(userAccNumber);
                    System.out.println(account);
                }
                else{
                    System.out.println("Error....");
                }
            }
            else if(userChoice == 5){
                if(accounts.isEmpty()){
                    System.out.println("Account is not yet created");
                }
                else{
                    for(Account account : accounts.values()){
                        System.out.println(account);
                    }
                }
            }
            else if(userChoice == 6){
                System.out.println("Thank you for banking with Dobby bank....");
                break;
            }
            else{
                System.out.println("Invalid option......");
            }

        }
    }
}
