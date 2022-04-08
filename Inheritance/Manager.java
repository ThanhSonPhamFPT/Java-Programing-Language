package com.java.inheritance;

public class Manager extends Staff{
    private String position;

    public Manager(){}

    public Manager(String position) {
        this.position = position;
    }

    public Manager(int ID, String name, double salary, String position) {
        super(ID, name, salary);
        this.position = position;
    }

    @Override
    public double bonusSalary() {
        return getSalary()*5;

    }
}
