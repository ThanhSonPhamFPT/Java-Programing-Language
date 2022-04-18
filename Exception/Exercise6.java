package com.java.exception;

public class Exercise6 {
    public static void main(String [] args){
        try {
            Exercise6 test = new Exercise6();
        } catch (InterruptedException e) {
            System.out.println("Got interrupted...");
        }
    }
    public Exercise6() throws InterruptedException{
        System.out.println("Preparing an Object");
        Thread.sleep(10000);
        System.out.println("Object is ready");
    }

}

