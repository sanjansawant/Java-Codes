package com.company;

/**
 * Created by sanja on 3/26/2017.
 */
public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(double size, String currentDirection) {
        super(size, "Outlander", currentDirection, 5, 5,false, 6);
        this.roadServiceMonths=12;
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void accelerate(double rate){

        double newVelocity=getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
            changeGear(1);
        }else if(newVelocity<=20){
            changeGear(2);
        }else if(newVelocity<=30){
            changeGear(3);
        }


        else {
            changeGear(4);
        }

        if(newVelocity>=0){
            move(getCurrentDirection(),newVelocity);

        }
    }

}
