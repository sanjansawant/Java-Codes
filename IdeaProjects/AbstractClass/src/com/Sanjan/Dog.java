package com.Sanjan;

/**
 * Created by sanja on 1/7/2017.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" is breathing");
    }
}
