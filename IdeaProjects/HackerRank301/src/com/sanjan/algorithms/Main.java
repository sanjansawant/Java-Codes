package com.sanjan.algorithms;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();



        System.out.println(numberNeeded(a, b));
    }


    public static int numberNeeded(String first, String second) {

        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<first.length();i++){


            char number=first.charAt(i);
            String number2=""+number;

            if(second.contains(number2)){

                sb.append(number2);


            }

        }
        System.out.println(sb);

        int length=first.length()+second.length()-(2*sb.length());
        return length;


    }

}
