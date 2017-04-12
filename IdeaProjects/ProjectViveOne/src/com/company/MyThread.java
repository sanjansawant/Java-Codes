package com.company;

/**
 * Created by sanja on 2/14/2017.
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by sanja on 2/14/2017.
 */
import java.util.*;


class MyThread extends Thread
{
    public static void main(String [] args)
    {
        MyThread t = new MyThread(); /* Line 5 */
        t.run();  /* Line 6 */
    }

    public void run()
    {
        for(int i=1; i < 3; ++i)
        {
            System.out.print(i + "..");
        }
    }
}


