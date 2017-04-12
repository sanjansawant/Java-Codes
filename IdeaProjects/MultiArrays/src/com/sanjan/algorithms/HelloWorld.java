package com.sanjan.algorithms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


class Me extends Person{
    private List skills;
    Me(String name, List skills){
        super(name);
        this.skills = skills;
    }

    public String toString(){
        return "Hello my name is "+this.name  + " and I know "+ this.skills;
    }
}

public class HelloWorld{

    public static void main(String []args){

        String timeStramp=new SimpleDateFormat("yyyy//MM//ss hh:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStramp);

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,2017);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,5);
        DateFormat date=new SimpleDateFormat("EEEEEE");
        String dff=date.format(cal.getTime());
        System.out.println(dff);




        List skills = new ArrayList();
        skills.add("collection");
        skills.add("multithreading");
        skills.add("inheritance");
        skills.add("encapsulation");
        Person me = new Me("John",skills);
        System.out.println(me);


    }
}