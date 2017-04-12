package com.sanjan.algorithms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Calendar cal= Calendar.getInstance();
        cal.set(Calendar.YEAR,2015);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DAY_OF_MONTH,15);
        Date df=cal.getTime();
        DateFormat dff=new SimpleDateFormat("EEEEEEEEEEEEE");

        String day=dff.format(df);
        System.out.println(day);
    }
}
