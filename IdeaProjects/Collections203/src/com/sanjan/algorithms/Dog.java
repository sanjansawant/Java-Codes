package com.sanjan.algorithms;

/**
 * Created by sanja on 1/30/2017.
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
    public final boolean equals(Object obj){

        if(this==obj){
            return true;
        }
        if(obj instanceof Dog){
            String name1=(((Dog)obj).getName());
            return name.equals(name1);


        }return false;


    }

}
