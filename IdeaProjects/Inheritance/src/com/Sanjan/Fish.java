package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Fish extends Animal {


    private int gills;
    private int eyes;
    private int fins;


    public Fish(int brain,  int weight, String name, int gills) {
        super(brain, 1, 1, weight, name);
        this.gills = gills;
    }

    public void rest(){

    }



    public void moveMuscles(){

    }
    public void moveBackFins(){


    }

    public void swim(){

        moveMuscles();
        moveBackFins();
        move(10);
    }
}
