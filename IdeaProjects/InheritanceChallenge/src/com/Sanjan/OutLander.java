package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class OutLander extends Car {

    private int roadServiceMethods;

    public OutLander(int roadServiceMethods) {
        super(432, "OutLander", 4, 4, false, 6);
        this.roadServiceMethods = roadServiceMethods;
    }

    //rate is the difference in the speed from the current speed
    public void accelerate(int rate){

        int newVelocity=getCurrentVelocity()+rate;

        if(newVelocity==0){
            stop();
            changeGear(1);
        }else if(newVelocity<=10){
            changeGear(1);
        }else if(newVelocity<=20){
            changeGear(2);
        }else if(newVelocity<=30){
            changeGear(3);
        }else{
            changeGear(4);
        }


        if (newVelocity>0){

            changeVelocity(getCurrentDirection(),newVelocity);
        }
    }


}
