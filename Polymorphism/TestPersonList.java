package com.java.polymorphism;

public class TestPersonList {
    public static void main(String [] args){
        PersonList myPersonList = new PersonList();
        Person person1 = new Professor("1", "Pham Thanh Son", 3,"Computing");
        Person person2 = new Professor("43", "Tran Van Linh", 5, "Geographic");
        Person student1 = new Student("3", "Trinh Do Duy Hung", 3, "Engineer", 2024);
        Person student2 = new Student("32", "Vo Minh Quoc", 5, "IT Program", 2024);
        myPersonList.add(person1);
        myPersonList.add(person2);
        myPersonList.add(student1);
        myPersonList.add(student2);
        myPersonList.displayAll(3);
        System.out.println("Average rank:" +myPersonList.average());
        myPersonList.maxRank().display();
        myPersonList.removePerson("43");
        System.out.println("-----------------");
        myPersonList.displayAll();
    }
}
