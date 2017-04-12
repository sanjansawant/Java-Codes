package com.sanjan.algorithms;

/**
 * Created by sanja on 1/21/2017.
 */
public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {

        if(this==obj){
            return true;
        }

        if(obj instanceof Dog){
            String objName=(((Dog)obj).getName());
            return this.name.equals(objName);
        }
        return false;
    }
}
