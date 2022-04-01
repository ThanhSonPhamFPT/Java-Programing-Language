package com.arthur.Bank;

import java.util.Scanner;

public class Bank {
    private static final int MAX_ACCOUNT = 20;
    private String name;
    private Account[] accounts;
    private int currentLength;
    public Bank(String name){
        this.name = name;
        accounts = new Account[MAX_ACCOUNT];
        currentLength = 0;
    }
    public void createAccount(Scanner sc){
        if (currentLength == MAX_ACCOUNT){
            System.out.println("Error: The bank is full, you can not create account now!");
        }else {
            System.out.println("Please enter the amount of account");
            double amount = sc.nextDouble();
            Account myAccount = new Account(amount);
            accounts[currentLength] = myAccount;
            currentLength++;
        }
    }
    public void withdraw(Scanner sc){
        if(currentLength ==0){
            System.out.println("There is no account in the bank");
        }else{
            int id;
            do{
                System.out.println("Please choose id of an account you want to withdraw:");
                id = sc.nextInt();
            }while (id<=0||id>currentLength);
            double amount;
            do{
                System.out.println("Please choose an amount you want to withdraw:");
                amount = sc.nextDouble();
            }while (amount<=0);
            accounts[id-1].withdraw(amount);
        }
    }
    public void deposit(Scanner sc){
        if(currentLength ==0){
            System.out.println("There is no account in the bank");
        }else {
            int id;
            do {
                System.out.println("Please choose id of an account you want to deposit:");
                id = sc.nextInt();
            } while (id <= 0 || id > currentLength);
            double amount;
            do {
                System.out.println("Please choose an amount you want to deposit:");
                amount = sc.nextDouble();
            } while (amount <= 0);
            accounts[id-1].deposit(amount);
        }
    }
    public void showAll(){
        System.out.println("Accounts in the bank "+name + " is");
        for (int i =0; i<currentLength;i++){
            accounts[i].show();
        }
    }
}
