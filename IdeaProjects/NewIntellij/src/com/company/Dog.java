package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
public class Dog extends Animal {


    public Dog(int legs) {
        super(legs);
    }
    @Override
    public static void move(){
        System.out.println("Dog.move() is called");

    }


    public static void eat(){

        System.out.println("Dog.eat() is called");
    }
}
