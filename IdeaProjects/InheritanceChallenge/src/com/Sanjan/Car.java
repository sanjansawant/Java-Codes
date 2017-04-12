package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Car extends Vehicle {


    private int wheels;
    private int door;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public int getCurrentGear() {
        return currentGear;
    }

    public Car(double size, String name, int wheels, int door, boolean isManual, int gears) {
        super(size, name);
        this.wheels = wheels;
        this.door = door;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println(this.currentGear);
    }

    public void changeVelocity(int direction, int velocity){
        super.move(direction,velocity);
        System.out.println("car.changeVelocity is called "+direction+" $$$ "+ velocity);

    }
}
