package com.java.inheritance;

public class Cat extends Mammal{
    public Cat() {
    }

    public Cat(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Cat - "+ super.toString();
    }
}
