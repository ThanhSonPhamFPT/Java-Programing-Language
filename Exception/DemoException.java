package com.java.exception;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {
    static Scanner sc = new Scanner(System.in);
    static int[] myArray = {3, 2 ,4, 6 , 4};
    static int balance = 1000;
    public static void main(String[] args) {
      //  System.out.println(manyExceptions());
//        System.out.println(inputInteger());
//        System.out.println("Hello, we end here");
//        checkInteger();
        /*try {
            checkAge();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        deposit(-500);

    }
    public static void deposit(int amount){
        int oldBalance = balance;
        balance +=amount;
        assert balance>oldBalance:"Error:Balance after deposit can not be smaller than old balance!!";
    }
    public static int checkAge() throws Exception{
        System.out.println("Enter your age:");
        int myInt = sc.nextInt();
        if (myInt<0 ||myInt>120) throw new Exception("Age invalid. Please try again");
        return myInt;
    }
    public static void readFile() throws IOException{
            FileReader myReader = new FileReader("text.txt");

    }
    public static int checkInteger() throws InputMismatchException{
        System.out.println("Enter your option:");
        int myInt = Integer.parseInt(sc.nextLine());
        return myInt;
    }
    public static int inputInteger(){
        do{
            try{
                System.out.println("Enter your option:");
                int myInt = Integer.parseInt(sc.nextLine());
                return myInt;
            }catch(NumberFormatException e){
                //sc.next();
                System.out.println("Wrong option. Please try again");
            }
        }while(true);
    }
    public static int manyExceptions(){
        try {
            System.out.println("Enter your option:");
            int myInt = sc.nextInt();
            return myArray[myInt];
        }catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Input Mismatch exception");
           // e.printStackTrace();
            return -1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound exception");
            return - 1;
        }
    }
}
