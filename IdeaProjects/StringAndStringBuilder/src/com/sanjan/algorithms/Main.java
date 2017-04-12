package com.sanjan.algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String string="I want to say \"I will get my desired job\" \\  common \'";
        System.out.println(string);

        char c='d';
        System.out.println(Character.toString(c));
        System.out.println();

        //equals and equalsIgnorecase
        //"something.charAt();
        //compareTo
        //contains

        System.out.println(string.endsWith("\'"));
        System.out.println(string.startsWith("I"));

        //endsWith
        //startsWith
        System.out.println(string.indexOf("to",4));
        //indexOf
        //lastIndexOf
        System.out.println(string.lastIndexOf("to"));

        String name="Sanjan";
        String[] array=name.split("");
        System.out.println(Arrays.toString(array));
        char[] charArray=name.toCharArray();
        System.out.println(Arrays.toString(charArray));

    }
}
