package com.Sanjan;

/**
 * Created by sanja on 1/7/2017.
 */
public abstract class Bird extends Animal implements CanFly {


    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating inside birdclass");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" is breathing inside breathe class ");
    }

    @Override
    public void fly(){
        System.out.println(getName()+" is flapping");
    }
}
