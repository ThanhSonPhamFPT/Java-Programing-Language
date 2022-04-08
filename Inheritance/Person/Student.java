package com.java.inheritance.Person;

public class Student extends Person {
    private final Status myStatus;
    public Student(){
        this.myStatus = new Status();
    }
    public Student(Status status){
        this.myStatus = status;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, Status myStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.myStatus = myStatus;
    }

    @Override
    public String toString() {
        return "myStatus=" + myStatus + super.toString();
    }
}
