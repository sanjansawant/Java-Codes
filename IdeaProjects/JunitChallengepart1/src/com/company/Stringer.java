package com.company;

/**
 * Created by sanja on 4/5/2017.
 */
public class Stringer {

    public static void main(String[] args) {
        String name="Sanjan";
        int n=name.length();
        String temp="";
        System.out.println(naming(name,n,temp));


    }

    public static String naming(String name,int n, String temp){


        n--;
        if(n<0){
            return temp;

        }
        else {
            temp += name.charAt(n);
            System.out.println(temp);
            naming(name, n, temp);
        }

        return "";

    }

}
