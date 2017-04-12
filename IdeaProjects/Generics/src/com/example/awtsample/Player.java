package com.example.awtsample;

/**
 * Created by sanja on 1/10/2017.
 */
public abstract class Player {
    private String name;

    public Player(String name){

        this.name=name;
    }

    public String getName() {
        return name;
    }
}
