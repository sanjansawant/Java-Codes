package com.Sanjan;

/**
 * Created by sanja on 1/9/2017.
 */
public class SomeClass {

    public final int instanceNumber;
    private final String name;
    private static int count=0;


    public SomeClass(String name) {
        count++;
        this.name=name;
        this.instanceNumber=count;
        System.out.println(name+" created, instance is "+instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
