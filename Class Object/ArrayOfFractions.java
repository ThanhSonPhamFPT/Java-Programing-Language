package com.arthur;

import com.hello.Fraction;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfFractions {
    public static Fraction[] myArray = new Fraction[10];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        while(true){
            menu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                        inputTenFraction();
                        break;
                case 2:
                        findTwoGreatestSumFraction();
                        break;
                case 3:
                        sortTheArray();
                        break;
                case 4:
                        System.out.println("Goodbye. See you again");
                        return;
                default: System.out.println("Invalid option");
            }



        }
    }

    public static void inputTenFraction() {
        for (int i=0;i<myArray.length;i++){
            System.out.println("Fraction number "+ (i+1));
            myArray[i] = new Fraction();
            myArray[i].input(sc);
        }
    }
    public static void findTwoGreatestSumFraction(){
        Fraction[] myTempArray = Arrays.copyOf(myArray,myArray.length);
        Arrays.sort(myTempArray);
        System.out.println("Two Greatest Sum Fraction is:"+myTempArray[myTempArray.length-2]+"+"+myTempArray[myTempArray.length-1]
        + "="+(myTempArray[myTempArray.length-2].add(myTempArray[myTempArray.length-1])));

    }
    public static void sortTheArray(){
        Fraction[] myTempArray = Arrays.copyOf(myArray,myArray.length);
        Arrays.sort(myTempArray);
        display(myTempArray);
    }
    public static void display(Fraction[] fractionArray){
        for (int i=0;i<fractionArray.length;i++){
            System.out.println(fractionArray[i]);
        }
    }
    public static void menu(){
        System.out.println("Here is a program which provides the following functionalies:");
        System.out.println("1. Input 10 Fractions");
        System.out.println("2. Find the two Fractions which have the greatest sum");
        System.out.println("3. Sort the fraction in ascending order");
        System.out.println("4. Exit");
        System.out.println("Please tell us your choice");
    }
}
