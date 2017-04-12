package com.company;

import java.util.function.Supplier;

/**
 * Created by sanja on 3/27/2017.
 */



public class TestDemo {
    public static void main(String[] args) {

        Long l=new Long(1234);
        long l1=1;
        if(l==l1){
            System.out.println("here");
        }else {
            System.out.println("here1");

        }
        l++;
        if(l==l1){
            System.out.println("here");
        }else{
            System.out.println("here1");
        }
    }
}
