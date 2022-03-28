package com.arthur;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome to Java Class.");
//	    System.out.print("Ten cua ban la gi:");
//        String myString = sc.nextLine();
//        System.out.println("Tuoi cua ban:");
//        int a = sc.nextInt();
//       // sc.nextLine();
//        System.out.println("Nghe nghiep cua ban la:");
//        String ngheNghiep = sc.nextLine();
//       // System.out.println("Gia dinh ban co may thanh vien");
//        int thanhVien = sc.nextInt();
//        System.out.println("Chao ban:" + myString + " Ban co so tuoi la: "+ a +
//                "Ban có nghe nghiep la: "+ngheNghiep);
//        System.out.println("Nhap vao mot thang");
//        int c = sc.nextInt();
//        if ( c>=1&&c<=3) {
//            System.out.println("Thang thuoc Quy I");
//        }
//       else if (c>=4&&c<=6) {
//            System.out.println("Thang thuoc Quy II");
//        }else if (c>=7&&c<=9){
//            System.out.println("Thang thuoc Quy III");
//        }else{
//            System.out.println("Thang thuoc Quy IV");
//        }
       int num1, num2, num3;
       System.out.print("Input first number");
       num1 = sc.nextInt();
        System.out.print("Input second number");
        num2 = sc.nextInt();
        System.out.print("Input third number");
        num3 = sc.nextInt();

        if (num1+num2>num3 && num1+num3>num2 && num2+num3>num1){
            System.out.println("This is 3 edges of triangle");
        }else{
            System.out.println("This is not 3 edges of triangle");
        }
//        System.out.println("Nhap vao mot thang");
//        int thang = sc.nextInt();
//        switch(thang){
//            case 1,3,5, 7, 8,10,12-> System.out.println("Thang co 31 ngay");
//
//            case 4,6,9,11-> System.out.println("Thang co 30 ngay");
//            case 2->
//                System.out.println("Thang co 28 ngay");
//            default->
//                System.out.println("Thang khong hop le");
//        }
       /*hello();
        hello();
        hello();
        hello();*/
    }

     public static void hello(){
        System.out.println("Day la he thong phat trien chuong trinh");
         System.out.println("Cac ban phai su dung no nhieu lan");
         System.out.println("No giup cac ban lam code ngan gon hon");
     }
}
