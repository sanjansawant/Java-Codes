package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
public class A {
    static int total=10;
    public void call(){
        int total=5;
        System.out.println(this.total);
    }

    public static void main(String[] args) {
        A a1=new A();
        a1.call();
    }
}
