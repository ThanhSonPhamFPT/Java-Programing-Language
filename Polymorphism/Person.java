package com.java.polymorphism;

import java.util.Scanner;

public abstract class Person {
    protected String code;
    protected String name;
    protected int rank;

    public Person(String code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }
    public Person(){

    }
    public void input(Scanner sc){
        System.out.println("Enter person code:");
        this.code = sc.nextLine();
        System.out.println("Enter person name:");
        this.name = sc.nextLine();
        System.out.println("Enter the rank:");
        this.rank = Integer.parseInt(sc.nextLine());
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public abstract String description();
    public void display(){
        System.out.println("Person code: "+code);
        System.out.println("Person name: "+name);
        System.out.println("Person rank: "+rank);
    }

}
