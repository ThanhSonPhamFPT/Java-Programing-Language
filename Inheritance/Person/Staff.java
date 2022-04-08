package com.java.inheritance.Person;

import java.util.Date;

public class Staff extends Employee{
    private String title;
    public Staff(){

    }
    public Staff(String title) {
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hiredDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.title = title;
    }

    public Staff(String office, double salary, Date hiredDate, String title) {
        super(office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' + super.toString();
    }
}
