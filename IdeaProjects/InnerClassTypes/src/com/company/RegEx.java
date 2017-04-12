package com.company;

/**
 * Created by sanja on 4/3/2017.
 */
public class RegEx {

    public static void main(String[] args) {

        String name="Sanjan Sawant";
        String name1=name.replaceAll("^San","Niran");
        System.out.println(name1);
        System.out.println(name.matches("^Sanjan Sawant"));

        System.out.println(name.replaceAll("[Snt]","X"));
        System.out.println(name.replaceAll("Snt","X"));

        String numbers="123456";
        System.out.println(numbers.replaceAll("[\\d]","a"));
        String test="tstvtkt";
        System.out.println(test.replaceAll("t(?=v)","X"));

        String number="(800) 123-4567";
        System.out.println(number.matches("[\\(]+[\\d]{3}[\\)]+[\\s]+[\\d]{3}[\\-]+[\\d]{4}"));


        String some="I want a bike.";
        System.out.println(some.matches("I want a (bike|ball)."));

        String aos="{1,2}";
        System.out.println(aos.matches("[\\{]{1}(\\d{1}[\\,]{1}\\d{1}[\\}])"));
    }

}
