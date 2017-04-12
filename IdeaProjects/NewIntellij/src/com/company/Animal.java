package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
public class Animal {

    private int legs;
    private int skin;
    private int eyes;

    public Animal(int legs) {
        this.legs = legs;
    }

    public static void move(){
        System.out.println("Animal.move() is called");
    }

}
