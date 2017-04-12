package com.company;

/**
 * Created by sanja on 2/24/2017.
 */
public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {

        if(satellite.getKey().getBodyType()==BodyTypes.MOON){
            return super.addSatellite(satellite);
        }else{
            return false;
        }
    }
}
