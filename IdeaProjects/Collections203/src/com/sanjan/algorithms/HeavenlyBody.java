package com.sanjan.algorithms;
import java.util.*;
/**
 * Created by sanja on 1/30/2017.
 */
public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private Set<HeavenlyBody> satellites;
    private BodyType systems;


    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }


    public void addMoon(HeavenlyBody satellite) {
        satellites.add(satellite);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellite() {
        return new HashSet<>(this.satellites);
    }

/*    @Override
    public boolean equals(String name){

    }

    */

    @Override
    public boolean equals(Object obj) {
        System.out.println("equal am called");
        if(this==obj){
            return true;
        }

        if(obj==null || (obj.getClass()!=this.getClass())){
            return false;
        }
        return this.name.equals(((HeavenlyBody)obj).getName());
    }

    @Override
    public int hashCode(){
        System.out.println("hashcodes am called");
        return satellites.hashCode()+57;

    }
}
