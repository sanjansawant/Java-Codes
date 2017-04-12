package com.Sanjan;

/**
 * Created by sanja on 1/7/2017.
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }


    public abstract void eat();
    public abstract void breathe();


    public String getName() {
        return name;
    }
}
