package com.java.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise1 {
    public static void main(String [] args){
        Employee emp1 = new Employee(10);
        Employee emp2 = new Employee(40);
        Employee emp3 = new Employee(30);
        Employee emp4 = new Employee(60);
        ArrayList<Employee> myList = new ArrayList<>();
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        myList.add(emp4);
        for (int i =0;i<myList.size();i++){
            System.out.println(myList.get(i).getAge());
        }
        Collections.sort(myList);
        System.out.println("After reverse sorting:");
        for (int i =0;i<myList.size();i++){
            System.out.println(myList.get(i).getAge());
        }
        Collections.sort(myList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("After accending sorting:");
        for (int i =0;i<myList.size();i++){
            System.out.println(myList.get(i).getAge());
        }
    }
}
class Employee implements Comparable<Employee>{
    private int age;
    public Employee(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
       return o.age - this.age;//in reverse order
        /*if (o.age>this.age) return 1;
        else if (o.age < this.age) return -1;
        else return 0;*/
    }
}

