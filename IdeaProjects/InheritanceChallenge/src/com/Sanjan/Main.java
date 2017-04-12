package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        OutLander outLander=new OutLander(12);
        outLander.steer(45);
        outLander.accelerate(30);
        outLander.accelerate(20);
        outLander.accelerate(-42);
        outLander.accelerate(-8);
    }
}
