package com.company;

import static com.company.ThreadColor.ANSI_RED;

/**
 * Created by sanja on 3/4/2017.
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from "+Thread.currentThread().getName());
    }
}
