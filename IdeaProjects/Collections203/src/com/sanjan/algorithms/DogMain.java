package com.sanjan.algorithms;

/**
 * Created by sanja on 1/30/2017.
 */
public class DogMain {
    public static void main(String[] args) {
        Dog dog=new Dog("Sanjan");
        Labrador labrador=new Labrador("Sanjan");

        System.out.println(dog.equals(labrador));
        System.out.println(labrador.equals(dog));
    }
}
