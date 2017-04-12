package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        Wall wall1=new Wall("WEST");
        Wall wall2=new Wall("EAST");
        Wall wall3=new Wall("SouTh");
        Wall wall4=new Wall("north");

        Ceiling ceiling=new Ceiling(12,"Yellow");
        Bed bed =new Bed("Modern",4,3,2,1);
        Lamp lamp=new Lamp("Classic",75,false);
        BedRoom bedroom=new BedRoom("tim",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
