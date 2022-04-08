package com.java.inheritance;

public class Animal {
    double weight;
    public Animal(){
        System.out.println("Create a new Animal");
    }

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                '}';
    }
}
