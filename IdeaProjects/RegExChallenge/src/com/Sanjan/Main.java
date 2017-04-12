package com.Sanjan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1="I want a bike.";
        String challenge2="I want a ball.";
        System.out.println(challenge1.matches("I want a [\\w]+."));

        matching(challenge2);

        String challenge3="Harry";
        System.out.println(challenge3.matches("[Hh]arry"));


        String challenge4="Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s","_"));

        String challenge5="aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefgq]+"));
        System.out.println("=======================");
        String challenge6="abcd.123";
        System.out.println(challenge6.matches("[\\w]{4}(\\.){1}[\\d]{3}"));
        //"[\\w]{4}(\\.){1}[\\d]{3}";

        String challenge7="abcd.123\tuvqz.7\ttzik.999\n";
        Pattern pattern=Pattern.compile("(\\w{3})(\\.{1})(\\d+)(\\s+)");
        Matcher matcher=pattern.matcher(challenge7);

        while(matcher.find()){

            System.out.println("start index "+matcher.start(3)+" end index "+(matcher.end(3)-1));
        }

        System.out.println("============================");
        String challenge11="{0,2},{0,5},{1,3},{2,4}";
        Pattern pattern2=Pattern.compile("\\{+(.+?)\\}+");
        Matcher matcher2=pattern2.matcher(challenge11);

        while (matcher2.find()){

            System.out.println("occurances "+matcher2.group(1));
        }

        String challenge14="11111";
        System.out.println(challenge14.matches("^\\d{5}(-+)?(\\d{4})?"));

    }


    public static void matching(String challenge2){


        Pattern pattern=Pattern.compile("I want a (bike|ball).");
        Matcher matcher =pattern.matcher(challenge2);
        System.out.println(matcher.matches());
    }
}
