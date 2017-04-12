package com.sanjan.algorithms;

/**
 * Created by sanja on 1/28/2017.
 */
public class CricketPlayer implements Comparable<CricketPlayer>{

    private final String name;
    private final int jerseyNunber;

    public CricketPlayer(String name, int jerseyNumber) {
        this.name=name;
        this.jerseyNunber=jerseyNumber;
    }

    @Override
    public int compareTo(CricketPlayer player) {
        return (this.name.compareTo(player.name));
    }

    public String getName() {
        return name;
    }

    public int getJerseyNunber() {
        return jerseyNunber;
    }
}
