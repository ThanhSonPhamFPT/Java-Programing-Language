package com.java.polymorphism;

import java.util.ArrayList;

public class PolymorphismExample {
    public static void main(String[] args){
        //Animal animal = new Animal();
        Animal animal1 = new YelloCat("Lina");
        //animal1.eat();--> error
        Dog     myDog = new Dog("Bingo");
        //myDog.bark();--> ok
        ArrayList<Animal> animalList = new ArrayList<>();
       // animalList.add(animal);
        animalList.add(animal1);
        animalList.add(myDog);
        for (int i =0;i<animalList.size();i++){
            animalList.get(i).speak();
            System.out.println(animalList.get(i).getI());
        }
        System.out.println(((Nameable)myDog).getName());
        Nameable mySecondDog = new Dog("Goodbye");
    }
}
interface Nameable{
    public static final int MAXIMUM = 200;
     void setName(String name);
     String getName();
}
abstract class Animal {
    protected String name;
    int i = 10;
    public Animal(){

    }
    public Animal(String name) {
        this.name = name;
    }
    public int getI(){
        return i;
    }
    public abstract void speak();

}
abstract class Cat extends Animal implements Nameable{
    int i = 20;
    public Cat(String name) {
        super(name);
    }
    public Cat(){

    }
    public int getI(){
        return i;
    }

    public void eat(){
        System.out.println("The cat is eating");
    }
    abstract  void display();
}
class YelloCat extends  Cat{
    public YelloCat(String name) {
        super(name);
    }

    public YelloCat() {
    }

    @Override
    public void speak() {

    }

    @Override
    void display() {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
class Dog extends Animal implements Nameable{
    int i = 30;
    public Dog(String name) {
        super(name);
    }
    public Dog(){

    }
    public void speak(){
        System.out.println("This is a dog");
    }
    public void bark(){
        System.out.println("The dog is barking");
    }
    public int getI(){
        return i;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
