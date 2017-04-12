package com.sanjan.algorithms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        String today=new SimpleDateFormat("yyyy/MM//dd HH:MM:SS").format(Calendar.getInstance().getTime());
        System.out.println(today);

        Calendar cal= Calendar.getInstance();
        cal.set(Calendar.YEAR,2017);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,3);

        Date date=cal.getTime();
        DateFormat dff=new SimpleDateFormat("EEEEEEEEEEEEEEEEEEEE");
        String today1=dff.format(date);
        System.out.println(today1);


       String[] stackArray;
       int stackSize=10;
       stackArray=new String[stackSize];

       int topOfStack=-1;

       Arrays.fill(stackArray,"-1");

       push("0");
    }

    public static void push(String input){




    }



}
