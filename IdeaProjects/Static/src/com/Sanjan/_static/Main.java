package com.Sanjan._static;

public class Main {

    public static void main(String[] args) {
        StaticTest test1=new StaticTest("test1");
        System.out.println(StaticTest.getNumInstances());
         test1=new StaticTest("test2");
        System.out.println(StaticTest.getNumInstances());

    }

    //fields and methods that are not static can be called only  be called
    //by creating class instance.static metods dont require class
    //instance.so static mthds cannot access non static methods
    //bcoz they dont exist when static mtds are called.

    //run program it calls java executable which looks for psvm
    // and passes the name of the class that contains psvm

    //run java program
    //there has to be starting point
    //however until the program runs there is no class instance to call the methods on.
    //ie y class has to use static method that can be called from class name
    //rather than instance

}
