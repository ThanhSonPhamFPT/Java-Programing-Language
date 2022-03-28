package com.arthur;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        twoLineStar();
        fiveStar();
        System.out.println();
        twoLineStar();
        fiveStar();
        twoLineStar();
        System.out.println();
        threeStar();
        twoLineStar();
        fiveStar();
        String option1 ="welcome";
        String option2 ="welcome";
        String option3 = sc.next();
        System.out.println(option1==option2);
        System.out.println(option1==option3);
        System.out.println(option1.equals(option3));

    }
    public static void twoLineStar(){
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void fiveStar(){
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }
    public static void threeStar(){
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
}
