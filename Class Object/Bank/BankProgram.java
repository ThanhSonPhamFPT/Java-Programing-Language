package com.arthur.Bank;

import java.util.Scanner;

public class BankProgram {
    private Bank myBank;
    public static Scanner sc = new Scanner(System.in);
    public BankProgram(){
        myBank = new Bank("Default Bank");
    }
    public void run(){
        int choice;
        do{
            printMenu();
            choice = getChoice();
            doTask(choice);
        }while (choice!=6);
    }
    public void doTask(int choice){
        switch(choice){
            case 1:
                createNewBank();
                break;
            case 2:
                myBank.createAccount(sc);
                break;
            case 3:
                myBank.withdraw(sc);
                break;
            case 4:
                myBank.deposit(sc);
                break;
            case 5:
                myBank.showAll();
            case 6:
                System.out.println("Thank you and See you again");
        }
    }
    public void printMenu(){
        System.out.println("Here is the menu of the program with the following Functionalities:");
        System.out.println("1. Create new Bank");
        System.out.println("2. Create account in the Bank");
        System.out.println("3. Withdraw money");
        System.out.println("4. Deposit money");
        System.out.println("5. Show information of the bank");
        System.out.println("6. Exit");
    }
    public int getChoice(){
        int choice;
        do {
            System.out.println("Please enter your choice:");
            choice = sc.nextInt();
        }while(choice<0||choice>6);
        sc.nextLine();
        return choice;
    }
    public static void main(String[] args){
        BankProgram myBankProgram = new BankProgram();
        myBankProgram.run();
    }
    public void createNewBank(){
        System.out.println("Enter the name of the Bank");
        String name = sc.nextLine();
        myBank = new Bank(name);
    }
}
