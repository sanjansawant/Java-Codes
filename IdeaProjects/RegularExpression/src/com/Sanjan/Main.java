package com.Sanjan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        String string="I am a string, I am";
        System.out.println(string);
        String newString=string.replaceAll("I","You");
        System.out.println(newString);

        String alphaNumeric="abcDeeeF12hhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".","Y"));
        System.out.println(alphaNumeric.replaceAll("^abcDeee","yyyyy"));
        System.out.println(alphaNumeric.replaceAll("99z$","abc"));
        System.out.println(alphaNumeric.matches("^abcDeeeF12hhiiiijkl99z$"));

        System.out.println(alphaNumeric.replaceAll("[aei]","U"));

        System.out.println("afefifajejij".replaceAll("[aei][fj]","q"));
        System.out.println("===============2nd lecture=====================");
        System.out.println("Harry".replaceAll("[Hh]arry","garry"));
        System.out.println(alphaNumeric.replaceAll("[^ej]","X"));
        System.out.println(alphaNumeric.replaceAll("[A-Fa-f3-8]","Q"));
        System.out.println(alphaNumeric.replaceAll("(?i)[a-z3-8]","E"));
        System.out.println(alphaNumeric.replaceAll("\\d","Z"));
        System.out.println(alphaNumeric.replaceAll("\\D","W"));
        String newString1 ="I have a blank and\\t a new tab\t and a new line\n";
        System.out.println(newString1);
        System.out.println(newString1.replaceAll("\\s",""));
        System.out.println("==========");
        System.out.println(newString1.replaceAll("\\S","Q"));
        System.out.println(alphaNumeric.replaceAll("\\w","T"));
        System.out.println(alphaNumeric.replaceAll("\\W","Y"));
        System.out.println(newString1.replaceAll("\\b","<>"));

        System.out.println("=========3rd Lecture===============");

        System.out.println(alphaNumeric.replaceAll("^abcDe{3}","J"));
        System.out.println(alphaNumeric.replaceAll("abcDe+","H"));
        System.out.println(alphaNumeric.replaceAll("^abcDe+q*","O"));
        System.out.println(alphaNumeric.replaceAll("[h+i*j+]","Y"));


        StringBuilder htmlText=new StringBuilder("<h1> this is the heading</h1");
        htmlText.append("<h2>this is subheading</h2>");
        htmlText.append("<p>this is paragraph</p>");
        htmlText.append("<p>this is sub para</p>");
        htmlText.append("<h2>this is summary</h2>");
        htmlText.append("<p>this is end</p>");
        System.out.println("********************8888888");

        Pattern pattern= Pattern.compile("<h2>"/*,Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE*/);
        Matcher matcher=pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        matcher.reset();
        int count=0;
        while(matcher.find()){

            count++;
            System.out.println("occurances "+count+" : "+matcher.start()+" to "+matcher.end());

        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&77");
        String grouper="(<h2>)(.*?)(</h2>)";
        Pattern groupPattern=Pattern.compile(grouper);
        Matcher groupMatcher=groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while ((groupMatcher.find())){


            System.out.println("occurances "+groupMatcher.group(1));
        }

        System.out.println("====5th lecture=====");
        String tv="tstvtkt";

        Pattern pattern1=Pattern.compile("(t(?!v))");
        Matcher matcher1=pattern1.matcher(tv);
        System.out.println(matcher1.matches());
        matcher1.reset();

        while(matcher1.find()){

            System.out.println("Occurances "+matcher1.group(1));
        }


        System.out.println("Enter a phone number");
        String number=input.nextLine();
        System.out.println(number.matches("^([\\(]?[\\d]{3}[\\)]?[\\s]?[\\d]{3}[-]?[\\d]{4})$"));
        System.out.println("enter visa card number");
        String number2=input.nextLine();
        System.out.println(number2.matches("^4[\\d]{12}([\\d]{3})?$"));
    }
}
