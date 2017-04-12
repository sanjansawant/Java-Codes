package com.sanjan.algorithms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your phone ");
        String phone=input.nextLine();

        String regex="^\\(?\\w{3}\\)?-?\\w{3}-?(\\w{4})$";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phone);
        System.out.println(matcher.matches());
        matcher.reset();

        while(matcher.find()){

            System.out.println(matcher.group(1));
            System.out.println(matcher.start(1)+" to "+matcher.end(1));


        }






    }
}
