package com.example.awtsample;

/**
 * Created by sanja on 1/10/2017.
 */
public abstract class Team {

    private String name;
    private int ranking;

    public Team(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }
}
