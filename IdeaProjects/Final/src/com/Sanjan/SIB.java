package com.Sanjan;

/**
 * Created by sanja on 1/9/2017.
 */
public class SIB {
    public static final String owner;

    static{
        owner="tim";
        System.out.println("sib called");
    }

    public SIB() {
        System.out.println("normal constructor called");
    }
    static{
        System.out.println("2nd sib called");
    }

    public void someMethod() {
        System.out.println("some method called");
    }
}
