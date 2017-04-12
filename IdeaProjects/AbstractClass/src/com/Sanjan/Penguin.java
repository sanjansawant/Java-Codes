package com.Sanjan;

/**
 * Created by sanja on 1/7/2017.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(getName()+" is not flapping");
    }
}
