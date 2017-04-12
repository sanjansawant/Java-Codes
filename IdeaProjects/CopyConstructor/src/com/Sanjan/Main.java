package com.Sanjan;


class Complex{
    private double real;
    private double imaginary;


    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // copy constructor
    public Complex(Complex c) {
        System.out.println("Copy constructor called");
        this.real = c.real;
        this.imaginary = c.imaginary;
    }


    public Complex addComplex(Complex c1,Complex c2){

        double real1=c1.real+c2.real;
        double imaginary1=c1.imaginary+c2.imaginary;
        return (new Complex(real1,imaginary1));

    }



    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}



public class Main {

    public static void main(String[] args) {

        Complex c1=new Complex(10,15);
        Complex c2=new Complex(1,2);
        Complex c3=c1.addComplex(c1,c2);

        System.out.println(c3.getReal()+"   "+c3.getImaginary());

        System.out.println("=============================");


        Complex c4 = new Complex(c1);

        // Note that following doesn't involve a copy constructor call as
        // non-primitive variables are just references.
        Complex c5 = c4;

        System.out.println(c4.getReal()+"   "+c4.getImaginary()); // toString() of c1 is called here


    }
}
