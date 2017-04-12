package com.company;
import java.util.*;
/**
 * Created by sanja on 1/30/2017.
 */
public abstract class HeavenlyBody  {

    private final Key key;
    private final double orbitalPeriod;
    private Set<HeavenlyBody> satellites;



    public enum BodyTypes{
        STAR,
        MOON,
        PLANET,
        DWARF_PLANET,
        COMET,
        ASTROID


    }


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodytype) {
        this.key = new Key(name,bodytype);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();

    }




    public boolean addSatellite(HeavenlyBody satellite) {

        return satellites.add(satellite);
    }


    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellite() {

        return new HashSet<>(this.satellites);
    }



    @Override
    public final boolean equals(Object obj) {
        System.out.println("heavenlybody equal am called");
        if(this==obj){
            return true;
        }
        if(obj instanceof HeavenlyBody){

            HeavenlyBody heavenlyBody=(HeavenlyBody)(obj);
            return (this.key.equals(heavenlyBody.getKey()));

        }

        return false;
    }

    public Key getKey() {
        return key;
    }

    public static Key makeKey(String name, BodyTypes type){
        return new Key(name,type);
    }

   /* @Override
    public final int hashCode(){
        System.out.println("hashcodes am called");
        return satellites.hashCode()+57+getBodyType().hashCode();

    }*/

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + key.getName() + '\'' +
                ", orbitalPeriod=" + orbitalPeriod+
                ", bodyType=" + key.getBodyType() +
                '}';
    }



    public static class Key{

        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }


        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+this.getBodyType().hashCode()+57;
        }

        @Override
        public boolean equals(Object obj) {
            System.out.println("key equal am called");
            Key heavenlyBody=(Key)obj;

            if(heavenlyBody.getName().equals(this.name)){

                return this.getBodyType()==heavenlyBody.getBodyType();

            }
            return false;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "name='" + name + '\'' +
                    ", bodyType=" + bodyType +
                    '}';
        }
    }
}
