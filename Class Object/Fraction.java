package com.hello;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator,int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }
    public Fraction(){
        this(0,1);
    }
    public Fraction(int number){
        this(number,1);
    }
    public Fraction(Fraction fraction){
        this(fraction.getNumerator(),fraction.getDenominator());
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Fraction simplify(){
        int gcd = gcd(this.numerator, this.denominator);
        Fraction newFrac = new Fraction(this.numerator/gcd,
                this.denominator/gcd);
        return newFrac;
    }
    public static int gcd(int a, int b){
        int r = a%b;
        while (r!=0){
            a = b;
            b = r;
            r = a%b;
        }
        return b;
    }
    public Fraction add(Fraction frac){
        int numerator = this.numerator*frac.denominator +
                this.denominator* frac.numerator;
        int denominator = this.denominator* frac.denominator;
        Fraction f1 = new Fraction(numerator,denominator);
        return f1.simplify();
    }
    public void display(){
        System.out.println(numerator+"/"+denominator);
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
}
