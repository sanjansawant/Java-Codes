package com.sanjan.algorithms;

/**
 * Created by sanja on 1/21/2017.
 */
public class DogMain {

    public static void main(String[] args) {
        Labrador Rover2=new Labrador("Rover");
        Dog Rover=new Dog("Rover");
        System.out.println(Rover.equals(Rover2));
        System.out.println(Rover2.equals(Rover));
    }
}
