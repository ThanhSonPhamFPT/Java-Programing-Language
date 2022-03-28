package com.arthur;

import java.util.Arrays;
import java.util.PropertyPermission;
import java.util.Scanner;

public class LoopArrays {
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
//    System.out.print("Input the number:");
//    int number = sc.nextInt();
//
//    for (int i=0;i<number;i++){
//        int count = 1;
//        for (int j =number-i-1;j<number;j++){
//            System.out.print(count++);
//        }
//        System.out.println();
//    }
      /*  int[] myIntArray = new int[10];
        int[] myIntArray2 = {2, 3, 5, 6, 20, 3, 6, 8, 10};
        double[] myDoubleArray = new double[5];
        String[] myStringArray;
        char[] myCharArray;
        boolean[] myBooleanArray = new boolean[10];
        myIntArray[0] = 10;
        myIntArray[1] = 30;
        myIntArray[2] = 50;
        myIntArray[3] = 5;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<myIntArray2.length;i++) {
            if (max<myIntArray2[i]){
                max = myIntArray2[i];
            }
            if (min>myIntArray2[i]){
                min = myIntArray2[i];
            }
            sum += myIntArray2[i];
        }
        System.out.println("Tong la:" +sum);
        System.out.println("Gia tri lon nhat la:" +max);
        System.out.println("Gia tri nho nhat la:" +min);
        Arrays.sort(myIntArray2);
        System.out.println(Arrays.toString(myIntArray2));
        for (int i=0;i<myBooleanArray.length;i++) {
            System.out.println(myBooleanArray[i]);
        }*/
        //Exercise 1
        for (int i=1;i<=5;i++){
            for(int j=9;j>=0;j--){
                for (int k = 1;k<=5;k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        //Exercise 2
        printSquare(1,5);
        printSquare2(3,9);
        int n=12;
        if (checkPrime(n)){
            System.out.println("Day la so nguyen to");
        }else{
            System.out.println("Day khong la so nguyen to");
        }
        System.out.print(n +" = ");
        primeMultiples(n);
        System.out.print("Nhap vao mot so nguyen");
        n = sc.nextInt();
        numberNumeral(n);
        printReverseNumber2(n);
    }
    public static void printReverse(int n){
        String value = n+ "";
        System.out.print("The reverse number of "+n + " is ");
        boolean check = false;
        for (int i=value.length()-1;i>=0;i--){
            if (value.charAt(i)=='0'&&check) {
                System.out.print(value.charAt(i));
            }
            if (value.charAt(i)!='0'){
                System.out.print(value.charAt(i));
                check = true;
            }
        }
        System.out.println();
    }
    public static void printReverseNumber2(int n){
        int countNumber = Integer.toString(n).length();
        System.out.print("The reverse number of "+n + " is ");
        int count =0;
        int sum =0;
        while (n>0) {
            int m = n % 10;
            sum = sum + m * (int) Math.pow(10, countNumber - 1 - count);
            count++;
            n = n/10;
        }
        System.out.println(sum);

    }
    public static int lastIndex(int[] array,int value){
        int index = -1;
        for (int i=0;i<array.length;i++){
            if (array[i] == value){
                index = i;
            }
        }
        return index;
    }
    public static int lastIndex2(int[] array,int value){
        for (int i=array.length-1;i>=0;i--){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void numberNumeral(int n){
        int sum =0;
        while (n>0){
            sum = sum +n%10;
            n =n/10;
        }
        System.out.println(sum);
    }
    public static boolean checkPrime(int n){
        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public static void primeMultiples(int n){
        int count =2;
        while (n>=count){
            if (n%count==0){
                if (n==count) System.out.print(count);
                else System.out.print(count+"*");
                n =n/count;
            }else{
                count++;
            }
        }
        System.out.println();

    }

    public static void printSquare(int min, int max){
        for (int i=min;i<=max;i++){
            for (int j = i;j<=max;j++){
                System.out.print(j);
            }
            for (int k=min;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void printSquare2(int min, int max){
        for (int i=min;i<=max;i++){
            int count =1;
            int value = i;
            while (count<=max-min+1){
                if (value>max) value = min;
                System.out.print(value++);
                count++;
            }
            System.out.println();
        }
    }
    public static int gcdBruteForce(int m, int n){
        int last = Math.min(m,n);
        int gcd=1;
        int i =1;
        while(i<=last) {
            if (m%i==0 && n%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
