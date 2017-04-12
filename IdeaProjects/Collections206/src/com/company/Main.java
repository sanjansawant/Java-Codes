package com.company;
import java.util.*;
public class Main {

    private static Map<HeavenlyBody.Key,HeavenlyBody> solarSystem=new HashMap<>();
    private static Set<HeavenlyBody> planets=new HashSet<>();

    public static void main(String[] args) {

//        Object o=new Object();
//        System.out.println(o.equals(o));

        System.out.println("=======================================");
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 348);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
        System.out.println("=======================================");
        for(HeavenlyBody temps:planets){

            System.out.println(temps);
        }

        System.out.println("=======================================");
        HeavenlyBody heaven=solarSystem.get(HeavenlyBody.makeKey("Mars",HeavenlyBody.BodyTypes.PLANET));
        System.out.println("==>");
        for(HeavenlyBody temps:heaven.getSatellite()){

            System.out.println(temps);

        }
        System.out.println("samampt");
        System.out.println("=======================================");

        System.out.println("All moons");

        Set<HeavenlyBody> allMoons=new HashSet<>();
        for(HeavenlyBody temps:planets){

            allMoons.addAll(temps.getSatellite());

        }

        for(HeavenlyBody temps:allMoons){

            System.out.println(temps);
        }

        System.out.println("=======================================");

        temp = new Dwarf_Planet("Pluto", 848454);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        for(HeavenlyBody temps:planets){

            System.out.println(temps);
        }


        //BodyType Star=new BodyType(new HeavenlyBody("Star",765));

        HeavenlyBody earth=new Planet("earth",365);
        HeavenlyBody earth1=new Planet("earth",456);
        System.out.println(earth.equals(earth1));
        System.out.println(earth1.equals(earth));

        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("SOLAR SYSTEM VALUES");
        for(HeavenlyBody heavenlyBody:solarSystem.values()){
            System.out.println(heavenlyBody);
        }

       /* String s="abcd";
        char[] array=s.toCharArray();
        array[array.length]='\u0000';
        for(int i=array.length;i>=0;i--){
            System.out.println(array[i]);
        }*/

       String name=reverse("abcd");
        System.out.println(name);

        String name1="-123";
        String[] array=name1.split("");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
    public static String reverse(String input){
        char[] data = input.toCharArray();
        int i = 0;
        int j = data.length - 1;
        char temp;

        while(i < j){
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }

        String s = new String(data);
        return s;
    }

   /* public static void tp(String number){
        System.out.println(number);
    }


    public static void tp(int number){
        System.out.println(number);
    }*/
}
