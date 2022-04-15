package com.java.polymorphism;

import java.util.Scanner;

public class Student extends Person{
    private String degreeProgram;
    private int yearOfGraduation;

    public Student(String code, String name, int rank, String degreeProgram, int yearOfGraduation) {
        super(code, name, rank);
        this.degreeProgram = degreeProgram;
        this.yearOfGraduation = yearOfGraduation;
    }

    public Student(String degreeProgram, int yearOfGraduation) {
        this.degreeProgram = degreeProgram;
        this.yearOfGraduation = yearOfGraduation;
    }
    public Student(){

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Description:"+description());
        System.out.println("Degree Program: "+degreeProgram);
        System.out.println("Year of Graduation: "+yearOfGraduation);
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Enter the Degree Program:");
        this.degreeProgram = sc.nextLine();
        System.out.println("Enter the year of Graduation:");
        this.yearOfGraduation = Integer.parseInt(sc.nextLine());
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    @Override
    public String description() {
        switch (rank){
            case 0: return "None";
            case 1: return "Freshman";
            case 2: return "Sophomore";
            case 3: return "Junior";
            case 4: return "Senior";
            case 5: return "Graduate";
            case 6: return "Masters Postgraduate";
            case 7: return "Phd Postgraduate";
            default: return "Error: Wrong rank. No description";
        }
    }
}
