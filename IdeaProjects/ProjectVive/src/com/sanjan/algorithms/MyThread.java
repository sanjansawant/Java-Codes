package com.sanjan.algorithms;

/**
 * Created by sanja on 2/14/2017.
 */
import java.util.*;

public class MyThread
{
    public static void main (String[] args)
    {
        Object x = new Vector().elements();
        System.out.print((x instanceof Enumeration)+",");
        System.out.print((x instanceof Iterator)+",");
        System.out.print(x instanceof ListIterator);
    }
}


