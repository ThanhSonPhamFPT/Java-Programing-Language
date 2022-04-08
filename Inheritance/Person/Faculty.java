package com.java.inheritance.Person;

import java.util.Date;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hiredDate, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String office, double salary, Date hiredDate, String officeHours, String rank) {
        super(office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' + super.toString();
    }
}
