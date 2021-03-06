package com.sanjan.algorithms;
import java.util.*;
public class Main {

    private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
    private static Set<HeavenlyBody> planets=new HashSet<>();
    public static void main(String[] args) {

        HeavenlyBody temp=new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);


        temp=new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon=new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
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


        HeavenlyBody pluto=new HeavenlyBody("Pluto", 284);
        solarSystem.put(pluto.getName(), pluto);
        planets.add(pluto);


        System.out.println("planets ");
        for(HeavenlyBody planet:planets){

            System.out.println("\t"+planet.getName()+"  "+planet.getOrbitalPeriod());
        }

        System.out.println("solarSystem");

        for(String name:solarSystem.keySet()){

            System.out.println("\t"+name);
        }



        HeavenlyBody moon=solarSystem.get("Jupiter");
        System.out.println("All moons of "+moon.getName());
        for(HeavenlyBody body:moon.getMoons()){

            System.out.println("\t"+body.getName());
        }

        Set<HeavenlyBody> allMoons=new HashSet<>();

        for(HeavenlyBody body:planets){
            allMoons.addAll(body.getMoons());
        }

        System.out.println("All Moons ");
        for(HeavenlyBody body:allMoons){
            System.out.println("\t"+body.getName());
        }


    }
}
