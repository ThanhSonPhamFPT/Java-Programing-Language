package com.arthur.Bank;

public class Account {
    private int id;
    private double balance;
    private static int count=0;
    public Account(double balance){
        this.balance = balance;
        count++;
        this.id = count;
    }
    public void withdraw(double amount){
        if (balance < amount) {
            System.out.println("The amount is bigger than the balance");
        }else{
            this.balance -=amount;
        }
    }
    public void deposit(double amount){
        this.balance +=amount;
    }
    public void show(){
        System.out.println("Id: "+ id + "  balance: "+balance);
    }
}
