package com.java.inheritance;

public class Staff {
    private int ID;
    private String name;
    private double salary;
    public Staff(){

    }
    public Staff(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
        this.salary = salary;
        else throw new IllegalStateException("Salary can not be negative");
    }
    public double bonusSalary(){
        return salary*2;
    }
}
