package com.company;

import static com.company.ThreadColor.ANSI_BLUE;

/**
 * Created by sanja on 3/4/2017.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from "+currentThread().getName());
        try{
            System.out.println("Time to sleep");
            Thread.sleep(5000);
        }catch(InterruptedException e){

            System.out.println(ANSI_BLUE+"Another Thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+"Three seconds have passed time to wake up");
    }
}
