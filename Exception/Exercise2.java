package com.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int[] myArray = {3, 2 ,4, 6 , 4};
        try {
            System.out.println("Enter your option:");
            int myInt = sc.nextInt();
            System.out.println(myArray[myInt]);
        }catch (Exception e) {
            System.out.println(e.getClass() +" Message:"+e.getMessage());
            // e.printStackTrace();
        }
    }

}
