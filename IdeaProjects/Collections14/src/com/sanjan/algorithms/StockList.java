package com.sanjan.algorithms;

/**
 * Created by sanja on 1/25/2017.
 */

class Base{
    public Base(){
        System.out.printf("Base");
    }


}


public class StockList extends Base{
    public static void main(String[] args) {
        new StockList();
        new Base();
        leftShift(4,2);

        String a="abc";
        String b="def";
        String c=b;
        b="qhi";
        System.out.println(a+b+c);

        Long q=new Long("42");
        Short w=new Short("42");
        if(q.equals(w)){
            System.out.println("here");
        }
    }



    public static void leftShift(int i,int j){

        i<<=j;

    }
}
