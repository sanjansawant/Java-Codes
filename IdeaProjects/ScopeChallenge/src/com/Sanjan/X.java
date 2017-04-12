package com.Sanjan;

import java.util.Scanner;

/**
 * Created by sanja on 1/5/2017.
 */
public class X {


    private int x;

    public X(Scanner x) {

        System.out.println("Enter a number");
        this.x = x.nextInt();
    }

    public void x(){

        for(int x=1;x<13;x++){

            System.out.println(this.x +" * "+x+" = "+this.x*x);

        }

    }

}
