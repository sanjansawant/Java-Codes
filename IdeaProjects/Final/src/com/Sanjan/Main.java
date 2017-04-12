package com.Sanjan;

import java.util.regex.Pattern;

public class Main{

    public static void main(String[] args) {

        /*SomeClass one=new SomeClass("one");
        SomeClass two=new SomeClass("two");
        SomeClass three=new SomeClass("three");
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        //System.out.println(Math.PI);
        Password a=new ExtendedPassword(123456);
        //a.encryptdecrypt(123456);
        a.saving();
        a.letMeIn(123456);
        System.out.println("===========");


*/
        System.out.println("main method is called");
        SIB a=new SIB();
        System.out.println("----");
        a.someMethod();
        System.out.println("---");
        System.out.println(a.owner);

    }
}
