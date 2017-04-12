package com.sanjan.algorithms;

/**
 * Created by sanja on 1/21/2017.
 */
import java.util.*;
public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> moons;
    private final BodyType bodyType;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.moons=new HashSet<>();
        this.bodyType=new BodyType();
    }


    public boolean addMoon(HeavenlyBody moon){

        return this.moons.add(moon);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getMoons() {
        return new HashSet<>(this.moons);
    }


    @Override
    public boolean equals(Object obj){

        if(this==obj){
            return true;
        }
        if(obj==null||obj.getClass()!=this.getClass()){
            return false;
        }

        String name=(((HeavenlyBody)obj).getName());
        return this.name.equals(name);

    }

    @Override
    public int hashCode() {
        System.out.print("Heaven ");
        return this.name.hashCode();
    }
}
