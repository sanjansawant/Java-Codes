package com.Sanjan;
import java.lang.reflect.Array;
import java.util.*;

class intClass{
    private int value;

    public intClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<intClass> intList=new ArrayList<>();
        intList.add(new intClass(54));
        ArrayList<String> newe=new ArrayList<>();

        ArrayList<Integer> newCombo=new ArrayList<>();

        Integer integer=new Integer(54);
        newCombo.add(integer);

        for(int i=0;i<10;i++){

            newCombo.add(Integer.valueOf(i));

        }

        for(int i=0;i<newCombo.size();i++){
            System.out.println(newCombo.get(i).intValue());
        }


        Integer number=56;//compile time Integer.valueOf(56);
        int number1=number;//compile time number.intValue();

        System.out.println("=====================================");
        ArrayList<Double> dblValue=new ArrayList<>();

        for(double dbl=0.0;dbl<10.0;dbl+=0.5){

            dblValue.add(dbl);//dblValue.add(Double.valueOf(dbl)

        }


        for(int i=0;i<dblValue.size();i++){

            System.out.println(dblValue.get(i).doubleValue());
        }


    }
}
