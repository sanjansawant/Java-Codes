package com.sanjan;

import com.sanjan.assignment.Series;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println("sum of "+i+" = "+Series.nSum(i));
            System.out.println("factorial of "+i+" = "+Series.factorial(i));
            System.out.println("fibonacci of "+i+" = "+Series.fibonacci(i));
            System.out.println("=============================");
        }

    }
}
