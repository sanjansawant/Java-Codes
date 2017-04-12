package com.company;

/**
 * Created by sanja on 2/24/2017.
 */
public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
