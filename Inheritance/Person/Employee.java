package com.java.inheritance.Person;

import java.util.Date;
public class Employee extends Person {
    private String office;
    private double salary;
    private Date hiredDate;
    public Employee(){

    }
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hiredDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public Employee(String office, double salary, Date hiredDate) {
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "office='" + office + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate+ super.toString();
    }
}
