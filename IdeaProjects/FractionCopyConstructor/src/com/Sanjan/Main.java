package com.Sanjan;


class Fraction {

    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator){
        this(numerator,3);
    }

    public Fraction(){
        this(3,3);
    }


    //copy constructor
    public Fraction(Fraction copy) {
        System.out.println("copy constructor called");
        this.numerator = copy.numerator;
        this.denominator = copy.denominator;
    }

    public Fraction addFraction(Fraction f1, Fraction f2) {

        double num1 = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        double num2 = (f1.denominator * f2.denominator);
        return new Fraction(num1, num2);

    }

    public int gcd(int num1,int num2){

        if(num1==0 || num2==0){

            return(num1+num2);
        }else{
            return gcd(num2,num1%num2);
        }

    }

    public double factorial(double number){

        if(number<=1){
            return 1;
        }else{

            return (number*factorial(number-1));
        }

    }

    @Override
    public String toString(){

        return (this.numerator+"/"+this.denominator);
    }



}

public class Main {

    public static void main(String[] args) {

        Fraction f1=new Fraction();
        Fraction f2=new Fraction(3);
        Fraction f3=new Fraction(4,4);
        Fraction f4=f1.addFraction(f3,f2);
        System.out.println(f4.toString());
        Fraction f5=new Fraction(f4);
        f4=f1.addFraction(f2,f1);
        System.out.println(f4.toString());
        System.out.println(f5.toString());
        double number=f1.factorial(5);
        System.out.println("factorail==> "+number);

    }
}
