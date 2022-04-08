package com.java.inheritance.Store;

public class Restaurant extends Store{
    private int numberPersonPerYear;
    private double costPerPerson;

    public Restaurant(String name, int numberPersonPerYear, double costPerPerson) {
        super(name);
        this.numberPersonPerYear = numberPersonPerYear;
        this.costPerPerson = costPerPerson;
    }

    public int getNumberPersonPerYear() {
        return numberPersonPerYear;
    }

    public void setNumberPersonPerYear(int numberPersonPerYear) {
        this.numberPersonPerYear = numberPersonPerYear;
    }

    public double getCostPerPerson() {
        return costPerPerson;
    }

    public void setCostPerPerson(double costPerPerson) {
        this.costPerPerson = costPerPerson;
    }

    @Override
    public String toString() {
        return "Restaurant{name + " + getName()+
                ", numberPersonPerYear=" + numberPersonPerYear +
                ", costPerPerson=" + costPerPerson +
                "} ";
    }
    public double tax(){
        return numberPersonPerYear*costPerPerson*SALESJAXJATE;
    }
}
