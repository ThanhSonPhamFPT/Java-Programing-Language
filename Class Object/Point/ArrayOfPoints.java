package com.arthur.Point;


import com.hello.Fraction;

import java.util.Scanner;

public class ArrayOfPoints {
    public static Point[] myArray = new Point[10];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            menu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    inputTenPoints();
                    display(myArray);
                    break;
                case 2:
                    findLargetDistance();
                    break;
                case 3:
                    findLargestCircumference();
                    break;
                case 4:
                    findLargestArea();
                    break;
                case 5:
                    System.out.println("Goodbye. See you again");
                    return;
                default: System.out.println("Invalid option");
            }
        }


    }

    private static void findLargestArea() {
        double max = -1;
        int index1 = -1, index2= -1, index3 = -1;
        for (int i = 0; i < myArray.length - 2; i++) {
            for (int j = i + 1; j < myArray.length-1; j++) {
                for (int k = j+1;k<myArray.length;k++){
                    double tempArea = Point.calculateArea(myArray[i],myArray[j],myArray[k]);
                    if (tempArea>max){
                        max = tempArea;
                        index1 = i;
                        index2 = j;
                        index3 = k;
                    }
                }
            }
        }
        System.out.printf("Maximum area of a triangle is :%.2f of three Points %s , " +
                "%s and %s\n",max, myArray[index1], myArray[index2],myArray[index3]);
    }

    private static void findLargestCircumference() {
        double max = -1;
        int index1 = -1, index2= -1, index3 = -1;
        for (int i = 0; i < myArray.length - 2; i++) {
            for (int j = i + 1; j < myArray.length-1; j++) {
                for (int k = j+1;k<myArray.length;k++){
                    double tempCircumference = Point.calculateCircumference(myArray[i],myArray[j],myArray[k]);
                    if (tempCircumference>max){
                        max = tempCircumference;
                        index1 = i;
                        index2 = j;
                        index3 = k;
                    }
                }
            }
        }
        System.out.printf("Maximum circumference of a triangle is :%.2f of three Points %s , " +
                "%s and %s\n",max, myArray[index1], myArray[index2],myArray[index3]);
    }

    private static void findLargetDistance() {
        double max = -1;
        int index1 = -1, index2= -1;

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].distance(myArray[j])>max){
                    max = myArray[i].distance(myArray[j]);
                    index1 = i;
                    index2 = j;
                }

            }
        }
        System.out.printf("Maximum distance of two Points is :%.2f of two Points %s , " +
                "%s and %s\n",max, myArray[index1], myArray[index2]);
    }

    private static void inputTenPoints() {
        for (int i=0;i<myArray.length;i++){
            System.out.println("Point number "+ (i+1));
            myArray[i] = new Point();
            myArray[i].input(sc);
        }
    }
    public static void display(Point[] pointArray){
        for (int i=0;i<pointArray.length;i++){
            System.out.println(pointArray[i]);
        }
    }
    public static void menu(){
        System.out.println("Here is a program which provides the following functionalies:");
        System.out.println("1. Input 10 Points");
        System.out.println("2. Find the largest distance between two Points");
        System.out.println("3. Find the Triangle that has largest circumference");
        System.out.println("4. Find the Triangle that has largest are");
        System.out.println("5. Exit");
        System.out.println("Please tell us your choice");
    }

}
