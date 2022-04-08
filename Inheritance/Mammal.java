package com.java.inheritance;

public class Mammal extends Animal{

    public Mammal() {
    }

    public Mammal(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Mammal - "  + super.toString();
    }
}
