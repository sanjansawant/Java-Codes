package com.Sanjan;

import java.util.ArrayList;

/**
 * Created by sanja on 1/6/2017.
 */
public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear=0;
    private boolean IsClutchOn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);

        for(int i=0;i<=maxGears;i++){
            gears.add(new Gear(i,i*5.3));
        }
    }

    public void operateClutch(boolean in){

        this.IsClutchOn=in;

    }

   /* public void addGears(int gear, double ratio){
        if(gear>0&&gear<=maxGears){

            gears.add(new Gear(gear,ratio));
        }else{
            System.out.println(gear+" not added");
        }
    }*/

    public void changeGear(int gear){

        if(gear>=0 &&gear<gears.size() && IsClutchOn){

            this.currentGear=gear;
            System.out.println("changed to "+this.currentGear);
        }else{
            System.out.println("grind");
            this.currentGear=0;
        }

    }

    public double wheelSpeed(int revs){

        if(IsClutchOn){
            System.out.println("Scream");
            return 0.0;
        }else{


            return revs*gears.get(currentGear).getRatio();
        }
    }

    public int getMaxGears() {
        return maxGears;
    }

    private class Gear {

        private int gearNo;
        private double ratio;

        public Gear(int gearNo, double ratio) {
            this.gearNo = gearNo;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return (this.ratio*revs);
        }

        public double getRatio() {
            return ratio;
        }
    }
}