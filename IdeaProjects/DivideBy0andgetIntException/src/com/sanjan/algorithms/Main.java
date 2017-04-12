package com.sanjan.algorithms;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }catch(NoSuchElementException | ArithmeticException e ){
            System.out.println("Arithmatic error");
            e.toString();
        }
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        return x / y;

    }


    private static int getInt() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Enter number between 0 and 9");

            }

        }
    }
}
