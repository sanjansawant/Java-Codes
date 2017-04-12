package com.Sanjan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanja on 1/6/2017.
 */
public class Monster implements ISaveable {

    private String name;
    private int strength;
    private int hitPoints;

    public Monster(String name, int strength, int hitPoints) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }


    @Override
    public ArrayList<String> write() {
        ArrayList<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.strength);
        values.add(2,""+this.hitPoints);
        //values.add(3,this.weapon);

        return values;

    }

    @Override
    public void read(List<String> values) {

        this.name=values.get(0);
        this.hitPoints=Integer.parseInt(values.get(1));
        this.strength=Integer.parseInt(values.get(2));
        //this.weapon=values.get(4);

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                '}';
    }
}
