package com.company;

/**
 * Created by sanja on 4/8/2017.
 */
public class Player {

    private String name;
    private int jerseyNumber;

    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
}
