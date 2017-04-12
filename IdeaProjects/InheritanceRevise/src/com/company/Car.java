package com.company;

/**
 * Created by sanja on 3/26/2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int door;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(double size, String name, String currentDirection, int wheels, int door, boolean isManual, int gears) {
        super(size, name);
        this.wheels = wheels;
        this.door = door;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int gear){
        if(gear>=0 && gear<=gears){
            this.currentGear=gear;
        }
        System.out.println(this.currentGear);
    }

    public void changeVelocity(String direction, int velocity){
        super.move(direction,velocity);

    }

    public int getWheels() {
        return wheels;
    }

    public int getDoor() {
        return door;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
