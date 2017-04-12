package com.Sanjan;


class Car {
    private int wheels;
    private boolean engine;
    private int cylinders;
    private String name;

    public Car(String name, int cylinders) {
        this.wheels = 4;
        this.engine = false;
        this.name = name;
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(boolean condition) {
        if (condition == true) {
            this.engine = condition;
            System.out.println("Engine has started");
        } else {
            System.out.println("engine isnt started yet");
        }
    }

    public void accelerate(int speed) {
        if (engine) {
            System.out.println(this.name + " is accelerating in " + speed);
        } else {
            System.out.println("start the engine");
        }
    }

    public void brake() {
        System.out.println(getClass().getSimpleName()+"==>brake");
        System.out.println("brake applied");
    }

    public int getSeats(){
        return -1;
    }


}


 class Ford extends Car {

    private int seats;

    public Ford(int seats) {
        super("ferrari",5);
        this.seats=seats;
    }
    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+"==>brake");
        super.brake();
    }
}

class Ferrari extends Car {

    private int seats;

    public Ferrari(int seats) {
        super("ferrari",5);
        this.seats=seats;
    }
    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+"==>brake");
        super.brake();
    }
}

class Mercedes extends Car {
    public Mercedes() {
        super("mercedes", 7);
    }
}

public class Main {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(2);
        ferrari.startEngine(false);
        ferrari.accelerate(5);
        ferrari.brake();
        System.out.println(ferrari.getSeats());

        Mercedes mercedes=new Mercedes();
        System.out.println(mercedes.getSeats());


        Ford ford = new Ford(2);
        ford.startEngine(false);
        ford.accelerate(5);
        ford.brake();
        System.out.println(ford.getSeats());

    }


}
