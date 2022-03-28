package com.hello;

public class Student {
    private static int numberStudents =0;
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        numberStudents++;
    }
    public static int getNumberOfStudent(){
        return numberStudents;
    }
    public double mean(){
        return (grade1 +grade2 +grade3)/3;
    }
    public void changeGrade(double grade1, double grade2, double grade3){
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public void displayInformation(){
        String classification;
        double averageGrade = this.mean();
        if (averageGrade>=8) classification = "Distinction";
        else if( averageGrade>=5) classification = "Pass";
        else classification = "Failed";
        System.out.printf("%-15s %-15.2f%-15s\n",name,averageGrade,classification);
    }


}
