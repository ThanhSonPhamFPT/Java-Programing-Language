package com.arthur.Point;

import java.util.Scanner;

public class Point {
    private double abscissa;
    private double ordinate;

    public Point() {
        this(0, 0);
    }

    public Point(double abscissa, double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public double getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(double abscissa) {
        this.abscissa = abscissa;
    }

    public double getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(double ordinate) {
        this.ordinate = ordinate;
    }

    public void input(Scanner sc) {
        System.out.println("Enter the abscissa:");
        this.abscissa = sc.nextDouble();
        System.out.println("Enter the ordinate:");
        this.ordinate = sc.nextDouble();
    }

    public void display() {
        System.out.print(this);
    }

    public String toString() {
        return "(" + abscissa + ";" + ordinate + ")";
    }

    /**
     * distance  = the root of ( (x1-x2)^2 + (y1-y2)^2)
     *
     * @param other another point
     * @return
     */
    public double distance(Point other) {
        return Math.sqrt((this.abscissa - other.abscissa) * (this.abscissa - other.abscissa)
                + (this.ordinate - other.ordinate) * (this.ordinate - other.ordinate));
    }

    /**
     * Calculate the area of the triangle with the formula
     * S = the root of (p*(p-p1)*(p-p2)*(p-p3) with
     * p = (p1+p2+p3)/2
     *
     * @param point1 First point
     * @param point2 Second point
     * @param point3 Last point
     * @return
     */
    public static double calculateArea(Point point1, Point point2, Point point3) {
        double p  = calculateCircumference(point1, point2, point3)/2;
        if (p !=0){
            double d1 = point1.distance(point2);
            double d2 = point1.distance(point3);
            double d3 = point2.distance(point3);
            double result = Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
            return result;
        } else return 0;
    }

    /**
     * circumference = sum of distance from 3 edges
     * Notice: calculate slope of point: m=(y2-y1)/(x2-x1) to determine if it is a triangle
     *
     * @param point1
     * @param point2
     * @param point3
     * @return
     */
    public static double calculateCircumference(Point point1, Point point2, Point point3) {
        if (isTriangle(point1, point2, point3)){
            double d1 = point1.distance(point2);
            double d2 = point1.distance(point3);
            double d3 = point2.distance(point3);
            return d1 + d2 + d3;
        }
        return 0;
    }

    /**
     * Determine if it is 3 points of a triangle
     * @param point1
     * @param point2
     * @param point3
     * @return
     */
    public static boolean isTriangle(Point point1, Point point2, Point point3) {
        if (point1.abscissa == point2.abscissa){
            if (point1.abscissa == point3.abscissa) return false;
            else return true;
        }else{
            if (point1.abscissa == point3.abscissa) return true;
            else{
                double m1 = (point2.ordinate - point1.ordinate)
                        /(point2.abscissa - point1.abscissa);
                double m2 = (point3.ordinate - point1.ordinate)
                        /(point3.abscissa - point1.abscissa);
                if (m1==m2) return false;
                else return true;
            }
        }
    }



}
