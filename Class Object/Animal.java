package com.hello;

public class Animal {
    private String color;
    String type;
    private double weight;
    public String name;
    public Animal(){
        weight = 3.0;
        type = "domestic";
    }
    public Animal(String color){
        this(color,"",0.0,"");
    }
    public Animal (double weight){
        this.weight = weight;
    }
    public Animal(String color, String type){
        this(color, type,0.0,"");
    }
    public Animal (String a, String b, double c, String d){
        color = a;
        this.type = b;
        this. weight = c;
        this.name = d;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if (weight <= 0) {
            System.out.println("Weight can not be negative or zero, please try again");
        }
        else this.weight = weight;
    }



    public void displayInformation() {
        System.out.println("This is a animal with name " +this.name);
    }
}
