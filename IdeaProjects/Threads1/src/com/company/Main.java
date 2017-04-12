package com.company;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_PURPLE;
import static com.company.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE+"Hello from the main thread.");
        Thread anotherThread=new AnotherThread();
        anotherThread.setName("===Another Thread===");
        anotherThread.start();


        //thread.start();
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from anonymous class");

            }

        }.start();


        Thread myRunnableThread=new Thread(new MyRunnable(){

            @Override
            public void run(){

                System.out.println(ANSI_RED+"Hello from "+Thread.currentThread().getName());
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED+"Another thread terminated or timed out so I am running again");
                }catch(InterruptedException e){
                    System.out.println(ANSI_RED+" I couldn't wait after all. I was interrupted");
                }

            }
        });
        myRunnableThread.setName("Runnable Thread");
        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello again from main thread");
    }
}
