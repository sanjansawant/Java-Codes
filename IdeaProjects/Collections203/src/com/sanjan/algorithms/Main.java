package com.sanjan.algorithms;
import java.util.*;
public class Main {

    private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
    private static Set<HeavenlyBody> planets=new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 348);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        for(HeavenlyBody temps:planets){

            System.out.println(temps.getName()+"  "+temps.getOrbitalPeriod());
        }

        System.out.println("=======================================");
        HeavenlyBody heaven=solarSystem.get("Mars");

        for(HeavenlyBody temps:heaven.getSatellite()){

            System.out.println(temps.getName()+"  "+temps.getOrbitalPeriod());

        }
        System.out.println("=======================================");

        System.out.println("All moons");

        Set<HeavenlyBody> allMoons=new HashSet<>();
        for(HeavenlyBody temps:planets){

            allMoons.addAll(temps.getSatellite());

        }

        for(HeavenlyBody temps:allMoons){

            System.out.println(temps.getName());
        }

        System.out.println("=======================================");
        tp(5);
        tp("5");



        BodyType Star=new BodyType(new HeavenlyBody("Star",765));



    }


    public static void tp(String number){
        System.out.println(number);
    }


    public static void tp(int number){
        System.out.println(number);
    }
}
