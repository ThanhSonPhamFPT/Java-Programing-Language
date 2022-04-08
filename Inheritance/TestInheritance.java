package com.java.inheritance;

import com.java.inheritance.Person.Employee;

import java.util.Scanner;


public class TestInheritance {

    public static final int MAX = 1000;
    public static void main(String[] args){
        Animal myAnimal= new Animal(40);
        Mammal myMammal = new Mammal(30);
        Mammal x = new Mammal();
        Cat myCat = new Cat();
        x.setWeight(100);
        myCat.setWeight(50);
        System.out.println(x.getWeight());
        System.out.println(myCat.getWeight());
        System.out.println(x);
        System.out.println(myCat);
        Employee myEmployee = new Employee();
        System.out.println(myEmployee);

    }

}
