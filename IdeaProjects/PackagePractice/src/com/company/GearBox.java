package com.company;

/**
 * Created by sanja on 4/1/2017.
 */
public class GearBox {

    private int gear;
    private String number;

    public GearBox(int gear, String number) {
        this.gear = gear;
        this.number = number;
     }


    private void changeGear(int gear){
        this.gear=gear;
        Gear gearing=new Gear();
        gearing.changing();

    }

    protected class Gear{

        public void changing(){

            gear=5;

        }



    }


    public interface Run{

        public void runnable();
        public void catchable();
    }
}
